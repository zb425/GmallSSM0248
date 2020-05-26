package com.java416.gmall.util;

import com.java416.gmall.bean.BookKind;
import com.java416.gmall.bean.Library;
import com.java416.gmall.bean.User;
import com.java416.gmall.bean.UserLevel;

import java.util.ArrayList;
import java.util.List;

public class TreeNoteUtil {

    public final static List<MenuTree> getFatherNode(List<BookKind> treesList){
        List<MenuTree> newTrees = new ArrayList<MenuTree>();
        List<MenuTree> towTrees=new ArrayList<>();
        MenuTree bookKind = new MenuTree();
        bookKind.setText("图书商城系统");
        bookKind.setId("0");
        newTrees.add(bookKind);
        MenuTree menuTree;
        for (BookKind mt : treesList) {
            menuTree=new MenuTree();
            menuTree.setId(mt.getbId());
            menuTree.setText(mt.getbName());
            towTrees.add(menuTree);
        }
        bookKind.setChildren(towTrees);
        return newTrees;
    }

    public final static List<MenuTree> getFatherLibraryNode(List<Library> treesList){
        List<MenuTree> newTrees = new ArrayList<MenuTree>();
        List<MenuTree> towTrees=new ArrayList<>();
        MenuTree bookKind = new MenuTree();
        bookKind.setText("图书商城供应商系统");
        bookKind.setId("0");
        newTrees.add(bookKind);
        MenuTree menuTree;
        for (Library mt : treesList) {
            menuTree=new MenuTree();
            menuTree.setId(mt.getLibraryId());
            menuTree.setText(mt.getLibraryName());
            towTrees.add(menuTree);
        }
        bookKind.setChildren(towTrees);
        return newTrees;
    }

    public final static List<MenuTree> getFatherUserLevleNode(List<UserLevel> treesList){
        List<MenuTree> newTrees = new ArrayList<MenuTree>();
        List<MenuTree> towTrees=new ArrayList<>();
        MenuTree bookKind = new MenuTree();
        bookKind.setText("用户等级总汇表");
        bookKind.setId("0");
        newTrees.add(bookKind);
        MenuTree menuTree;
        for (UserLevel mt : treesList) {
            menuTree=new MenuTree();
            menuTree.setId(mt.getlId());
            menuTree.setText(mt.getlName());
            towTrees.add(menuTree);
        }
        bookKind.setChildren(towTrees);
        return newTrees;
    }

}
