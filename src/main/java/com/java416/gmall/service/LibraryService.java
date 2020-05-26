package com.java416.gmall.service;

import com.java416.gmall.bean.Library;
import com.java416.gmall.bean.LibraryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LibraryService {

    int countByExample(LibraryExample example);

    int deleteByExample(LibraryExample example);

    int deleteByPrimaryKey(String libraryId);

    int insert(Library record);

    int insertSelective(Library record);

    List<Library> selectByExample(LibraryExample example);

    Library selectByPrimaryKey(String libraryId);

    int updateByExampleSelective(@Param("record") Library record, @Param("example") LibraryExample example);

    int updateByExample(@Param("record") Library record, @Param("example") LibraryExample example);

    int updateByPrimaryKeySelective(Library record);

    int updateByPrimaryKey(Library record);
}
