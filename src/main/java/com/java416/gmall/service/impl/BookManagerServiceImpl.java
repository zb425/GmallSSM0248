package com.java416.gmall.service.impl;

import com.java416.gmall.bean.BookManagerExample;
import com.java416.gmall.bean.BookManagerKey;
import com.java416.gmall.dao.BookManagerMapper;
import com.java416.gmall.service.BookManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManagerServiceImpl implements BookManagerService {
    @Autowired
    private BookManagerMapper bookManagerMapper;

    @Override
    public int countByExample(BookManagerExample example) {
        return bookManagerMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BookManagerExample example) {
        return bookManagerMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(BookManagerKey key) {
        return bookManagerMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(BookManagerKey record) {
        return bookManagerMapper.insert(record);
    }

    @Override
    public int insertSelective(BookManagerKey record) {
        return bookManagerMapper.insertSelective(record);
    }

    @Override
    public List<BookManagerKey> selectByExample(BookManagerExample example) {
        return bookManagerMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(BookManagerKey record, BookManagerExample example) {
        return bookManagerMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(BookManagerKey record, BookManagerExample example) {
        return bookManagerMapper.updateByExample(record,example);
    }
}
