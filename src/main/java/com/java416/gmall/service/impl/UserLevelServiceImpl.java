package com.java416.gmall.service.impl;

import com.java416.gmall.bean.UserLevel;
import com.java416.gmall.bean.UserLevelExample;
import com.java416.gmall.dao.UserLevelMapper;
import com.java416.gmall.service.UserLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLevelServiceImpl implements UserLevelService {

    @Autowired
    private UserLevelMapper userLevelMapper;

    @Override
    public int countByExample(UserLevelExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserLevelExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String lId) {
        return userLevelMapper.deleteByPrimaryKey(lId);
    }

    @Override
    public int insert(UserLevel record) {
        return userLevelMapper.insert(record);
    }

    @Override
    public int insertSelective(UserLevel record) {
        return 0;
    }

    @Override
    public List<UserLevel> selectByExample(UserLevelExample example) {

        return userLevelMapper.selectByExample(example);
    }

    @Override
    public UserLevel selectByPrimaryKey(String lId) {

        return userLevelMapper.selectByPrimaryKey(lId);
    }

    @Override
    public int updateByExampleSelective(UserLevel record, UserLevelExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UserLevel record, UserLevelExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UserLevel record) {
        return userLevelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserLevel record) {

        return userLevelMapper.updateByPrimaryKey(record);
    }
}
