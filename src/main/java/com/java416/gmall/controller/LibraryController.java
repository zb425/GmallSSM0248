package com.java416.gmall.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.java416.gmall.bean.*;
import com.java416.gmall.service.BookKindService;
import com.java416.gmall.service.BookManagerService;
import com.java416.gmall.service.LibraryService;
import com.java416.gmall.util.Messges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class LibraryController {

    @Autowired
    private LibraryService libraryService;
    @Autowired
    private BookKindService bookKindService;

    @Autowired
    private BookManagerService bookManagerService;


    @RequestMapping("/selectLibraryAll")
    @ResponseBody
    public List<Library> selectLibraryAll(){
        List<Library> libraries = libraryService.selectByExample(null);
        return libraries;
    }

    @RequestMapping(value = "/libraryAdd",method = RequestMethod.POST)
    @ResponseBody
    public Messges libraryAdd(Library library) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        library.setLibraryCreattime(df.parse(df.format(new Date())));

        int libraries = libraryService.insert(library);
        if(libraries>0){
            return  Messges.success();
        }
        return Messges.error();
    }

    @RequestMapping("/findLibraryById")
    @ResponseBody
    public Messges findLibraryById(@RequestParam("id") String id){
        Library libraries = libraryService.selectByPrimaryKey(id);
        return Messges.success(libraries);
    }

    @RequestMapping(value = "/library/update",method = RequestMethod.POST)
    @ResponseBody
    public Messges libraryUpdate(Library library) throws ParseException {
        int libraries = libraryService.updateByPrimaryKeySelective(library);
        if(libraries>0){
            return  Messges.success();
        }
        return Messges.error();
    }

    @RequestMapping(value = "/multDeleteUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Messges libraryUpdate(@RequestParam("multId") String[] multId) {
        int libraries=0;
        for (int i = 0; i <multId.length; i++) {
             libraries = libraryService.deleteByPrimaryKey(multId[i]);
        }
        if(libraries>0){
            return  Messges.success();
        }
        return Messges.error();
    }

    @RequestMapping(value = "/expFindLibraryInfo",method = RequestMethod.POST)
    @ResponseBody
    public Messges libraryUpdate(@RequestParam("library_Id") String library_Id,@RequestParam("libraryName") String libraryName) {
        LibraryExample libraryExample = new LibraryExample();
        LibraryExample.Criteria criteria = libraryExample.createCriteria();
        if(!library_Id.equals("")&&library_Id!=null){
            criteria.andLibraryIdEqualTo(library_Id);
        }
        if(!libraryName.equals("")&&libraryName!=null){
            criteria.andLibraryNameLike("%"+libraryName+"%");
        }
        List<Library> users = libraryService.selectByExample(libraryExample);
        return Messges.success(users);
    }


    @RequestMapping(value = "/searchLibraryBook",method = RequestMethod.POST)
    @ResponseBody
    public Messges searchLibraryBook(@RequestParam("id") String id,@RequestParam("libraryBookId") String libraryBookId,@RequestParam("libraryBookName") String libraryBookName) {
        List<BookKind> bookManager = findBookManager(id, libraryBookId, libraryBookName);
        return Messges.success(bookManager);
    }

    public List<BookKind> findBookManager(String id,String libraryBookId,String libraryBookName){
        BookManagerExample bookManagerExample = new BookManagerExample();
        bookManagerExample.createCriteria().andLibraryIdEqualTo(id);
        List<BookManagerKey> libraries = bookManagerService.selectByExample(bookManagerExample);
        List<String> list = new ArrayList<>();
        for (BookManagerKey library : libraries) {
            list.add(library.getbId());
        }

        BookKindExample bookKindExample = new BookKindExample();
        BookKindExample.Criteria criteria = bookKindExample.createCriteria();
        if(!libraryBookId.equals("")&&libraryBookId!=null){
            criteria.andBIdEqualTo(libraryBookId);
        }
        if(!libraryBookName.equals("")&&libraryBookName!=null){
            criteria.andBNameLike("%"+libraryBookName+"%");
        }
        criteria.andBIdIn(list);
        List<BookKind> bookKinds = bookKindService.selectByExample(bookKindExample);

        return bookKinds;
    }
}
