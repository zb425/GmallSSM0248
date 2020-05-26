package com.java416.gmall.service;

import com.java416.gmall.bean.BookKind;
import com.java416.gmall.bean.BookKindExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookKindService {
    int countByExample(BookKindExample example);

    int deleteByExample(BookKindExample example);

    int deleteByPrimaryKey(String bId);

    int insert(BookKind record);

    int insertSelective(BookKind record);

    List<BookKind> selectByExample(BookKindExample example);

    BookKind selectByPrimaryKey(String bId);

    int updateByExampleSelective(@Param("record") BookKind record, @Param("example") BookKindExample example);

    int updateByExample(@Param("record") BookKind record, @Param("example") BookKindExample example);

    int updateByPrimaryKeySelective(BookKind record);

    int updateByPrimaryKey(BookKind record);
}
