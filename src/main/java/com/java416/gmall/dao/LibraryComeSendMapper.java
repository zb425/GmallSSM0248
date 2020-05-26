package com.java416.gmall.dao;

import com.java416.gmall.bean.LibraryComeSend;
import com.java416.gmall.bean.LibraryComeSendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibraryComeSendMapper {
    int countByExample(LibraryComeSendExample example);

    int deleteByExample(LibraryComeSendExample example);

    int deleteByPrimaryKey(String libraryCsId);

    int insert(LibraryComeSend record);

    int insertSelective(LibraryComeSend record);

    List<LibraryComeSend> selectByExample(LibraryComeSendExample example);

    LibraryComeSend selectByPrimaryKey(String libraryCsId);

    int updateByExampleSelective(@Param("record") LibraryComeSend record, @Param("example") LibraryComeSendExample example);

    int updateByExample(@Param("record") LibraryComeSend record, @Param("example") LibraryComeSendExample example);

    int updateByPrimaryKeySelective(LibraryComeSend record);

    int updateByPrimaryKey(LibraryComeSend record);
}