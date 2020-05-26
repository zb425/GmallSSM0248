package com.java416.gmall.controller;

import com.java416.gmall.bean.*;
import com.java416.gmall.service.BookKindService;
import com.java416.gmall.service.BookManagerService;
import com.java416.gmall.util.Messges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookManagerController {

    @Autowired
    private BookManagerService bookManagerService;

    @Autowired
    private BookKindService bookKindService;

    @RequestMapping("/findBookManager/{id}")
    @ResponseBody
    public List<BookKind> findBookManager(@PathVariable("id") String id){
        BookManagerExample bookManagerExample = new BookManagerExample();
        bookManagerExample.createCriteria().andLibraryIdEqualTo(id);
        List<BookManagerKey> libraries = bookManagerService.selectByExample(bookManagerExample);
        List<String> list = new ArrayList<>();
        for (BookManagerKey library : libraries) {
              list.add(library.getbId());
        }

        BookKindExample bookKindExample = new BookKindExample();
        bookKindExample.createCriteria().andBIdIn(list);
        List<BookKind> bookKinds = bookKindService.selectByExample(bookKindExample);

        return bookKinds;
    }
}
