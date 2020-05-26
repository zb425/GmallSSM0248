package com.java416.gmall.dao;

import com.java416.gmall.bean.BookKind;
import com.java416.gmall.bean.BookKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookKindMapper {
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