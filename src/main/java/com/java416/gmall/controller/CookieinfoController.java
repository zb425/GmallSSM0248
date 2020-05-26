package com.java416.gmall.controller;

import com.java416.gmall.bean.BookInfo;
import com.java416.gmall.bean.BookInfoExample;
import com.java416.gmall.bean.Cookieinfo;
import com.java416.gmall.bean.CookieinfoExample;
import com.java416.gmall.service.BookInfoService;
import com.java416.gmall.service.CookieinfoService;
import com.java416.gmall.util.Messges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CookieinfoController {
    @Autowired
    private CookieinfoService cookieinfoService;
    @Autowired
    private BookInfoService bookInfoService;

    @RequestMapping("/main/selectBookInfoCookieAll")
    @ResponseBody
    public Messges selectBookInfoCookieAll(@RequestParam("pageNum") Integer currPage, @RequestParam("pageSize") Integer pageSize
            , @RequestParam("id") String id){
        Map<String, Object> data = new HashMap<>();
        data.put("id",id);
        data.put("currIndex", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        List<Cookieinfo> cookieinfos = cookieinfoService.queryCookieBySql(data);
        List<BookInfo> list = new ArrayList<>();
        for (int i = 0; i <cookieinfos.size() ; i++) {
            BookInfoExample bookInfoExample = new BookInfoExample();
            bookInfoExample.createCriteria().andBookIdEqualTo(cookieinfos.get(i).getbId());
            List<BookInfo> list1 = bookInfoService.selectByExample(bookInfoExample);
            list.add(list1.get(0));
        }
        return Messges.success(list);
    }

    @RequestMapping("/main/getCookieAll")
    @ResponseBody
    public Messges count(@RequestParam("id") String id){
        CookieinfoExample cookieinfoExample = new CookieinfoExample();
        cookieinfoExample.createCriteria().andUIdEqualTo(id);
        int i = cookieinfoService.countByExample(cookieinfoExample);
        return Messges.success(i);
    }

    @RequestMapping("/insertCookie")
    @ResponseBody
    public Messges insertCookie(@RequestParam("book_id") String book_id,@RequestParam("u_id") String u_id){
        Cookieinfo cookieinfo = new Cookieinfo();
        cookieinfo.setbId(book_id);
        cookieinfo.setuId(u_id);
        cookieinfo.setcStatus(0);
        int rows = cookieinfoService.insert(cookieinfo);
        if(rows>0){
            return Messges.success();
        }
        return Messges.error();
    }

}
