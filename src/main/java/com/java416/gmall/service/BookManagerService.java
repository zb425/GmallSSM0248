package com.java416.gmall.service;

import com.java416.gmall.bean.BookManagerExample;
import com.java416.gmall.bean.BookManagerKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookManagerService {
    int countByExample(BookManagerExample example);

    int deleteByExample(BookManagerExample example);

    int deleteByPrimaryKey(BookManagerKey key);

    int insert(BookManagerKey record);

    int insertSelective(BookManagerKey record);

    List<BookManagerKey> selectByExample(BookManagerExample example);

    int updateByExampleSelective(@Param("record") BookManagerKey record, @Param("example") BookManagerExample example);

    int updateByExample(@Param("record") BookManagerKey record, @Param("example") BookManagerExample example);
}
