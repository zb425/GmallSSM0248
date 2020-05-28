package com.java416.gmall.controller;

import com.java416.gmall.bean.*;
import com.java416.gmall.service.BookInfoService;
import com.java416.gmall.service.LibraryComeSendService;
import com.java416.gmall.service.OrderBookService;
import com.java416.gmall.util.Messges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class LibraryComeSendController {
    @Autowired
    private LibraryComeSendService libraryComeSendService;

    @Autowired
    private OrderBookService orderBookService;

    @Autowired
    private BookInfoService bookInfoService;

    @RequestMapping("/libraryComeSendSelectAll/{id}")
    @ResponseBody
    public List<LibraryComeSend> libraryComeSendSelectAll(@PathVariable("id") String id){
        LibraryComeSendExample libraryComeSendExample = new LibraryComeSendExample();
        libraryComeSendExample.createCriteria().andLibraryIdEqualTo(id);
        List<LibraryComeSend> libraryComeSends = libraryComeSendService.selectByExample(libraryComeSendExample);
        return libraryComeSends;
    }

    @RequestMapping("/updateLibraryComeSend")
    @ResponseBody
    public Messges updateLibraryComeSend(@RequestParam("id") String id, @RequestParam("type") String type)throws  Exception{
        /*System.out.println(id + " " +type);*/
        LibraryComeSend libraryComeSend = new LibraryComeSend();
        libraryComeSend.setLibraryCsId(id);
        libraryComeSend.setLibraryCsType(Integer.valueOf(type));
        int i = libraryComeSendService.updateByPrimaryKeySelective(libraryComeSend);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(i>0){
            OrderBook orderBook = new OrderBook();
            OrderBookExample orderBookExample = new OrderBookExample();
            orderBookExample.createCriteria().andLibraryCsIdEqualTo(id);
            List<OrderBook> orderBooks = orderBookService.selectByExample(orderBookExample);
            orderBook.setoId(orderBooks.get(0).getoId());
            orderBook.setoCreatetime(df.parse(df.format(new Date())));
            orderBook.setoSSstate(Integer.valueOf(type));
            int rows = orderBookService.updateByPrimaryKeySelective(orderBook);
            if(rows>0){
                if(Integer.valueOf(type)==3){
                    OrderBook book = orderBooks.get(0);
                    BookInfo bookInfo = bookInfoService.selectByPrimaryKey(book.getBookId());
                    BookInfo info = new BookInfo();
                    info.setBookId(book.getBookId());
                    info.setBookTotal(bookInfo.getBookTotal()+1);
                    info.setBookSales(bookInfo.getBookSales()-1);
                    int result = bookInfoService.updateByPrimaryKeySelective(info);
                    if(result>0){
                        return Messges.success();
                    }
                }
                return Messges.success();
            }
        }
        return Messges.error();
    }


}
