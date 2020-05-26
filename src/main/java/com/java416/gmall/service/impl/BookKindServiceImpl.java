package com.java416.gmall.service.impl;

import com.java416.gmall.bean.BookKind;
import com.java416.gmall.bean.BookKindExample;
import com.java416.gmall.dao.BookKindMapper;
import com.java416.gmall.service.BookKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookKindServiceImpl implements BookKindService {

    @Autowired(required=true)
    private BookKindMapper bookKindMapper;

    @Override
    public int countByExample(BookKindExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(BookKindExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String bId) {

        return bookKindMapper.deleteByPrimaryKey(bId);
    }

    @Override
    public int insert(BookKind record) {
        return bookKindMapper.insert(record);
    }

    @Override
    public int insertSelective(BookKind record) {
        return 0;
    }

    @Override
    public List<BookKind> selectByExample(BookKindExample example) {
        return bookKindMapper.selectByExample(example);
    }

    @Override
    public BookKind selectByPrimaryKey(String bId) {

        return bookKindMapper.selectByPrimaryKey(bId);
    }

    @Override
    public int updateByExampleSelective(BookKind record, BookKindExample example) {
        return 0;
    }

    @Override
    public int updateByExample(BookKind record, BookKindExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(BookKind record) {
        return bookKindMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKey(BookKind record) {
        return bookKindMapper.updateByPrimaryKey(record);
    }
}
