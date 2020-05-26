package com.java416.gmall.controller;

import com.java416.gmall.bean.*;
import com.java416.gmall.service.*;
import com.java416.gmall.util.MenuTree;
import com.java416.gmall.util.Messges;
import com.java416.gmall.util.TreeNoteUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class OrderBookController {

    @Autowired
    private OrderBookService orderBookService;

    @Autowired
    private LibraryService libraryService;

    @Autowired
    private LibraryComeSendService libraryComeSendService;

    @Autowired
    private BookManagerService bookManagerService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private WaybillService waybillService;

    @Autowired
    private BookInfoService bookInfoService;

    @RequestMapping("/orderSelectAll")
    @ResponseBody
    public List<OrderBook> orderSelectAll(){
        List<OrderBook> orderBooks = orderBookService.selectByExample(null);
        return orderBooks;
    }

    @RequestMapping("/selectLibraryTree")
    @ResponseBody
    public List<MenuTree> selectBookKindAll(){
        List<Library> bookKinds = libraryService.selectByExample(null);
        //用于把接收到的数据改造成EasyUI tree认识的数据格式
        List<MenuTree> menuTrees = new ArrayList<MenuTree>();
        try {
            menuTrees= TreeNoteUtil.getFatherLibraryNode(bookKinds);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return menuTrees;
    }

    /*"order_Id":order_Id,"libraryOrder_Id":libraryOrder_Id,"libraryOrder_Pay":libraryOrder_Pay,"libraryOrder_state":libraryOrder_state,"libraryOrder_success":libraryOrder_success*/
    @RequestMapping("/expFindOrder")
    @ResponseBody
    public Messges expFindOrder(@RequestParam("order_Id") String id1,@RequestParam("libraryOrder_Id") String id2,@RequestParam("libraryOrder_Pay") String id3,@RequestParam("libraryOrder_state") String id4,@RequestParam("libraryOrder_success") String id5){
        OrderBookExample orderBookExample = new OrderBookExample();
        OrderBookExample.Criteria criteria = orderBookExample.createCriteria();
        if(!id1.equals("")&&id1!=null){
            criteria.andOIdEqualTo(id1);
        }
        if(!id2.equals("")&&id2!=null){
            criteria.andLibraryCsIdEqualTo(id2);
        }
        if(!id3.equals("-1")){
            criteria.andOPalyEqualTo(Integer.parseInt(id3));
        }
        if(!id4.equals("-1")){
            criteria.andOStateEqualTo(Integer.parseInt(id4));
        }
        if(!id5.equals("-1")){
            criteria.andOSSstateEqualTo(Integer.parseInt(id5));
        }
        List<OrderBook> orderBooks = orderBookService.selectByExample(orderBookExample);
        return Messges.success(orderBooks);
    }

    @RequestMapping("/expFindLibrary")
    @ResponseBody
    public Messges expFindLibrary(@RequestParam("id") String id1,@RequestParam("orderCenter_Id") String id2,@RequestParam("orderCenter_state") String id3){
        LibraryComeSendExample libraryComeSendExample = new LibraryComeSendExample();
        LibraryComeSendExample.Criteria criteria = libraryComeSendExample.createCriteria();
        if(!id1.equals("")&&id1!=null){
            criteria.andLibraryIdEqualTo(id1);
        }
        if(!id2.equals("")&&id2!=null){
            criteria.andLibraryCsIdEqualTo(id2);
        }
        if(!id3.equals("-1")){
            criteria.andLibraryCsTypeEqualTo(Integer.parseInt(id3));
        }

        List<LibraryComeSend> libraryComeSends = libraryComeSendService.selectByExample(libraryComeSendExample);
        return Messges.success(libraryComeSends);
    }

    /*前台调用*/
    @RequestMapping("/addOrderLibrary")
    @ResponseBody
    public Messges addOrderLibrary(@RequestParam("bookName") String bookName,
                                   @RequestParam("oTotal") String oTotal,
                                   @RequestParam("oDiscount") String oDiscount,
                                   @RequestParam("oPay") String oPay,
                                   @RequestParam("bookId") String bookId,
                                    @RequestParam("u_id") String u_id) throws Exception {
        System.out.println(bookId+" "+u_id);
        String libraryID = getLibraryID(bookId);
        String id = insertLibrary(libraryID, bookName);
        int i = insertOrderBook(bookId, id, u_id, oTotal, oPay, oDiscount);
        if(i>0){
            String addressID = getAddressID(u_id);
            int rows = insertwuliId(addressID, id);
            if(rows>0){
                return Messges.success();
            }
        }
        return Messges.error();
    }


    public String getLibraryID(String bookId){
        BookInfo bookInfo = bookInfoService.selectByPrimaryKey(bookId);

        BookManagerExample bookManagerExample = new BookManagerExample();
        bookManagerExample.createCriteria().andBIdEqualTo(bookInfo.getbId());
        List<BookManagerKey> bookManagerKeys = bookManagerService.selectByExample(bookManagerExample);
        return bookManagerKeys.get(0).getLibraryId();
    }

    public String insertLibrary(String libraryId,String bookName)throws  Exception{
        String string = String.valueOf(System.currentTimeMillis());
        String str = string.substring(0,10)+(int)Math.random()*100;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        LibraryComeSend libraryComeSend = new LibraryComeSend();
        libraryComeSend.setLibraryCsId(str);
        libraryComeSend.setLibraryId(libraryId);
        libraryComeSend.setLibraryCsName(bookName);
        libraryComeSend.setLibraryCsType(1);
        libraryComeSend.setLibraryCsCount(1);
        libraryComeSend.setLibraryCsTime(df.parse(df.format(new Date())));
        int insert = libraryComeSendService.insert(libraryComeSend);
        return str;
    }

    public int insertOrderBook(String bookId,String id,String u_id,String total,String oPay,String oDiscount) throws  Exception{
        //自动生成编号
        String string = String.valueOf(System.currentTimeMillis());
        String str = "1"+(int)Math.random()*100+string.substring(0,10);

        //自动生成订单号
        String o_id = String.valueOf(Math.random()).substring(2,13);

        //自动生成物流编号
        String n = String.valueOf(Math.random()).substring(2,12);
        String m = String.valueOf(System.currentTimeMillis()).substring(0,5);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        OrderBook orderBook = new OrderBook();
        orderBook.setoId(str);
        orderBook.setBookId(bookId);
        orderBook.setLibraryCsId(id);
        orderBook.setuId(u_id);
        orderBook.setoCode(o_id);
        orderBook.setoTotal(Float.valueOf(total));
        orderBook.setoPay(Float.valueOf(oPay));
        orderBook.setoRetrun(Float.valueOf(0));
        orderBook.setoDiscount(Float.valueOf(oDiscount));
        orderBook.setoPaly(0);
        orderBook.setoState(1);
        orderBook.setoWuliucode(n+m);
        orderBook.setoJf(1);
        orderBook.setoSSstate(0);
        orderBook.setoCCreatetime(df.parse(df.format(new Date())));
        orderBook.setoCreatetime(df.parse(df.format(new Date())));
        int insert = orderBookService.insert(orderBook);

        return insert;
    }

    public String getAddressID(String u_id){
        AddressExample addressExample = new AddressExample();
        AddressExample.Criteria criteria = addressExample.createCriteria();
        criteria.andUIdEqualTo(u_id);
        criteria.andAddTFEqualTo(1);
        List<Address> addresses = addressService.selectByExample(addressExample);
        return addresses.get(0).getAddId();
    }

    public int insertwuliId(String wuliId,String id) throws  Exception{
        //自动货运编号
        String n = String.valueOf(Math.random()).substring(4,10);
        String m = String.valueOf(System.currentTimeMillis()).substring(3,6);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Waybill waybill = new Waybill();
        waybill.setWaybillId(n+m);
        waybill.setLibraryCsId(id);
        waybill.setaId(wuliId);
        waybill.setCreateTime(df.parse(df.format(new Date())));
        waybill.setwStatue(0);
        return waybillService.insert(waybill);
    }

    /*前台调用*/
    @RequestMapping("/selectOrderAll")
    @ResponseBody
    public Messges mainSelectOrderAll(@RequestParam("pageNum") Integer currPage,@RequestParam("pageSize") Integer pageSize
            ,@RequestParam("id") String id){
        Map<String, Object> data = new HashMap<>();
        data.put("id",id);
        data.put("currIndex", (currPage-1)*pageSize);
        data.put("pageSize", pageSize);
        List<OrderBook> orderBooks = orderBookService.queryOrderBySql(data);
        //return Messges.success(bookInfos);
        return Messges.success(orderBooks);
    }

    @RequestMapping("/main/getOrderAll")
    @ResponseBody
    public Messges getOrderAll(@RequestParam("u_id") String id){
        OrderBookExample orderBookExample = new OrderBookExample();
        orderBookExample.createCriteria().andUIdEqualTo(id);
        int i = orderBookService.countByExample(orderBookExample);
        return Messges.success(i);
    }

    @RequestMapping("/main/updateOrderById")
    @ResponseBody
    public Messges updateOrderById(@RequestParam("u_id") String id,@RequestParam("book_id") String book_id){
        OrderBook orderBook = orderBookService.selectByPrimaryKey(id);
        orderBook.setoSSstate(1);
        int i = orderBookService.updateByPrimaryKey(orderBook);
        if(i>0){
            BookInfo bookInfo = bookInfoService.selectByPrimaryKey(book_id);
            Integer bookSales = bookInfo.getBookSales();
            bookInfo.setBookSales(bookSales+1);
            int rows = bookInfoService.updateByPrimaryKey(bookInfo);
            return Messges.success();
        }
        return Messges.error();
    }
}
