package com.java416.gmall.service.impl;

import com.java416.gmall.bean.Cookieinfo;
import com.java416.gmall.bean.CookieinfoExample;
import com.java416.gmall.dao.CookieinfoMapper;
import com.java416.gmall.service.CookieinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CookieinfoServiceImpl implements CookieinfoService {

    @Autowired
    private CookieinfoMapper cookieinfoMapper;


    @Override
    public int countByExample(CookieinfoExample example) {
        return cookieinfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CookieinfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer cId) {
        return 0;
    }

    @Override
    public int insert(Cookieinfo record) {
        return cookieinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Cookieinfo record) {
        return 0;
    }

    @Override
    public List<Cookieinfo> selectByExample(CookieinfoExample example) {
        return cookieinfoMapper.selectByExample(example);
    }

    @Override
    public Cookieinfo selectByPrimaryKey(Integer cId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Cookieinfo record, CookieinfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Cookieinfo record, CookieinfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Cookieinfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Cookieinfo record) {
        return 0;
    }

    @Override
    public List<Cookieinfo> queryCookieBySql(Map<String, Object> data) {
        return cookieinfoMapper.queryCookieBySql(data);
    }
}
