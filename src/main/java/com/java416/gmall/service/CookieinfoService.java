package com.java416.gmall.service;

import com.java416.gmall.bean.Cookieinfo;
import com.java416.gmall.bean.CookieinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CookieinfoService {

    int countByExample(CookieinfoExample example);

    int deleteByExample(CookieinfoExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Cookieinfo record);

    int insertSelective(Cookieinfo record);

    List<Cookieinfo> selectByExample(CookieinfoExample example);

    Cookieinfo selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Cookieinfo record, @Param("example") CookieinfoExample example);

    int updateByExample(@Param("record") Cookieinfo record, @Param("example") CookieinfoExample example);

    int updateByPrimaryKeySelective(Cookieinfo record);

    int updateByPrimaryKey(Cookieinfo record);

    List<Cookieinfo> queryCookieBySql(Map<String,Object> data);
}
