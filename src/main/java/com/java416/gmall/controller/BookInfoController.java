package com.java416.gmall.controller;

import com.java416.gmall.bean.BookInfo;
import com.java416.gmall.bean.BookInfoExample;
import com.java416.gmall.bean.BookKind;
import com.java416.gmall.service.BookInfoService;
import com.java416.gmall.service.BookKindService;
import com.java416.gmall.util.Messges;
import javafx.scene.control.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BookInfoController {

    @Autowired
    private BookInfoService bookInfoService;
    @Autowired
    private BookKindService bookKindService;

    @RequestMapping("menuTree/bookInfo/{id}")
    @ResponseBody
    public List<BookInfo> getBookInfoById(@PathVariable("id") String id,Integer page,Integer rows,HttpServletRequest request){
        Map<String, Object> data = new HashMap<>();
        data.put("currIndex", (page-1)*rows);
        data.put("pageSize", rows);
        data.put("id",id);
        List<BookInfo> list = bookInfoService.queryBookInfoBySql(data);
        return list;
    }

    @RequestMapping(value = "bookInfoAdd",method = RequestMethod.POST)
    @ResponseBody
    public Messges addBookInfo( @RequestParam(value="file",required = false)
            MultipartFile  file,BookInfo bookInfo, HttpServletRequest request) throws  Exception{
        bookInfo.setBookImg(file.getOriginalFilename());
        bookInfo.setBookSales(0);
        savePicture(file, request);
        int rows = bookInfoService.insert(bookInfo);
        if(rows>0){
            BookKind bookKind = bookKindService.selectByPrimaryKey(bookInfo.getbId());
            bookKind.setbCount(bookKind.getbCount()+1);
            int i = bookKindService.updateByPrimaryKey(bookKind);
            if(i>0){
                return Messges.success();
            }
            //return Messges.success();
        }

        return Messges.error();
    }

    //文件保存到服务器上
    protected void savePicture(MultipartFile file, HttpServletRequest request)
            throws IOException, FileNotFoundException {
        String ImagePath = request.getSession().getServletContext().getRealPath("upload");
        File targetfile = new File(ImagePath, file.getOriginalFilename());
        Date date = new Date(System.currentTimeMillis());
        if(targetfile.exists()){
            String[] s = file.getOriginalFilename().split("\\.");
            s[0] += date.getTime();
            targetfile = new File(ImagePath, s[0] + "." + s[1]);
        }
        InputStream ins = file.getInputStream();
        FileOutputStream fos = new FileOutputStream(targetfile);

        byte b[] = new byte[1024];
        int temp = 0;

        while((temp = ins.read(b)) != -1){
            fos.write(b, 0, temp);
        }

        fos.close();
        ins.close();
    }

    @RequestMapping("findBookInfoById")
    @ResponseBody
    public Messges findBookInfoById(@RequestParam("id") String id){
        BookInfo bookInfo = bookInfoService.selectByPrimaryKey(id);
        return Messges.success(bookInfo);
    }

    @RequestMapping(value = "/bookInfoUpdate",method = RequestMethod.POST)
    @ResponseBody
    public Messges updateBookInfo(@RequestParam(value="file",required = false)
           MultipartFile  file,BookInfo bookInfo, HttpServletRequest request) throws Exception{

        if(file.getOriginalFilename()==null||file.getOriginalFilename().equals("")){
            int rows = bookInfoService.updateByPrimaryKeySelective(bookInfo);
            if(rows>0){
                return Messges.success();
            }
        }else{
            bookInfo.setBookImg(file.getOriginalFilename());
            savePicture(file, request);
            int rows = bookInfoService.updateByPrimaryKeySelective(bookInfo);
            if(rows>0){
                return Messges.success();
            }
        }
        return Messges.error();
    }

    @RequestMapping("multDeleteBookInfo")
    @ResponseBody
    public Messges multDeleteBookInfo(@RequestParam("multId") String[] multId){
        for (int i = 0; i <multId.length ; i++) {
            BookInfoExample bookInfoExample=new BookInfoExample();
            bookInfoExample.createCriteria().andBookIdEqualTo(multId[i]);
            int rows = bookInfoService.deleteByExample(bookInfoExample);
        }
        return Messges.success();
    }

    @RequestMapping("expFindBookInfo")
    @ResponseBody
    public Messges eexpFindBookInfo(@RequestParam("bookInfoId") String bookInfoId,@RequestParam("bookInfoName") String bookInfoName){
        BookInfoExample bookInfoExample = new BookInfoExample();
        BookInfoExample.Criteria criteria = bookInfoExample.createCriteria();
        if(!bookInfoId.equals("")&&bookInfoId!=null){
            criteria.andBookIdEqualTo(bookInfoId);
        }
        if(!bookInfoName.equals("")&&bookInfoName!=null){
            criteria.andBookNameLike("%"+bookInfoName+"%");
        }
        List<BookInfo> bookInfos = bookInfoService.selectByExample(bookInfoExample);
        return Messges.success(bookInfos);
    }

    /*前台调用*/
    @RequestMapping("main/selectBookInfoAll")
    @ResponseBody
    public Messges selectBookInfoAll(@RequestParam("pageNum") Integer currPage,@RequestParam("pageSize") Integer pageSize
            ,@RequestParam("text") Integer text,@RequestParam("textName") String textName){
        Map<String, Object> data = new HashMap<>();
        data.put("text",text);
        data.put("textName",textName);
        data.put("currIndex", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        List<BookInfo> bookInfos = bookInfoService.queryStudentsBySql(data);
        return Messges.success(bookInfos);
    }

    @RequestMapping("main/getBookInfoAll")
    @ResponseBody
    public Messges getBookInfoAll(){
        int bookInfos = bookInfoService.countByExample(null);
        return Messges.success(bookInfos);
    }
}
