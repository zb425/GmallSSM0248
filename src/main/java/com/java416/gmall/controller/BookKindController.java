package com.java416.gmall.controller;

import com.java416.gmall.bean.BookInfoExample;
import com.java416.gmall.bean.BookKind;
import com.java416.gmall.service.BookInfoService;
import com.java416.gmall.service.BookKindService;
import com.java416.gmall.util.MenuTree;
import com.java416.gmall.util.Messges;
import com.java416.gmall.util.TreeNoteUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookKindController {

    @Autowired
    private BookKindService bookKindService;
    @Autowired
    private BookInfoService bookInfoService;


    @RequestMapping("menuTree/selectMenuTree")
    @ResponseBody
    public List<MenuTree> selectBookKindAll(){
        List<BookKind> bookKinds = bookKindService.selectByExample(null);
        //用于把接收到的数据改造成EasyUI tree认识的数据格式
        List<MenuTree> menuTrees = new ArrayList<MenuTree>();
        try {
            menuTrees= TreeNoteUtil.getFatherNode(bookKinds);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return menuTrees;
    }

    @RequestMapping("bookKind/add")
    @ResponseBody
    public Messges addBookKind(BookKind bookKind){
        int row = bookKindService.insert(bookKind);
        return Messges.success();
    }

    @RequestMapping(value = "bookKind/update")
    @ResponseBody
    public Messges updateBookKind(BookKind bookKind){
        //System.out.println(bookKind);
        int rows = bookKindService.updateByPrimaryKey(bookKind);
        if(rows>0){
            return Messges.success();
        }
        return Messges.error();
    }

    @RequestMapping("findBookById")
    @ResponseBody
    public Messges findBookById(@RequestParam("id") String id){
        BookKind bookKind = bookKindService.selectByPrimaryKey(id);
        return Messges.success(bookKind);
    }

    @RequestMapping("deleteBookKind")
    @ResponseBody
    public Messges deleteBookKindById(@RequestParam("id") String id){
        System.out.println(id);
        BookInfoExample bookInfoExample=new BookInfoExample();
        bookInfoExample.createCriteria().andBIdEqualTo(id);
        int infoRows = bookInfoService.deleteByExample(bookInfoExample);
        if(infoRows>=0){
            int bookRows = bookKindService.deleteByPrimaryKey(id);
            if(bookRows>0){
                return Messges.success();
            }
        }
        return Messges.error();
    }

    @RequestMapping("bookKind/selectAll")
    @ResponseBody
    public Messges findBookKindAll(){
        List<BookKind> bookKinds = bookKindService.selectByExample(null);
        return Messges.success(bookKinds);
    }


    /*前台调用*/
    @RequestMapping(value = "main/selectLibraryAll",method = RequestMethod.POST)
    @ResponseBody
    public Messges mainSelectBookKindAll(){
        List<BookKind> bookKinds = bookKindService.selectByExample(null);
        return Messges.success(bookKinds);
    }
}
