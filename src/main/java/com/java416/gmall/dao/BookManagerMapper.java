package com.java416.gmall.dao;

import com.java416.gmall.bean.BookManagerExample;
import com.java416.gmall.bean.BookManagerKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookManagerMapper {
    int countByExample(BookManagerExample example);

    int deleteByExample(BookManagerExample example);

    int deleteByPrimaryKey(BookManagerKey key);

    int insert(BookManagerKey record);

    int insertSelective(BookManagerKey record);

    List<BookManagerKey> selectByExample(BookManagerExample example);

    int updateByExampleSelective(@Param("record") BookManagerKey record, @Param("example") BookManagerExample example);

    int updateByExample(@Param("record") BookManagerKey record, @Param("example") BookManagerExample example);
}