package com.java416.gmall.service.impl;

import com.java416.gmall.bean.BookInfo;
import com.java416.gmall.bean.BookInfoExample;
import com.java416.gmall.dao.BookInfoMapper;
import com.java416.gmall.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookInfoServiceImpl implements BookInfoService {

    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Override
    public int countByExample(BookInfoExample example) {

        return bookInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BookInfoExample example) {
        return bookInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String bookId) {
        return 0;
    }

    @Override
    public int insert(BookInfo record) {

        return bookInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(BookInfo record) {
        return 0;
    }

    @Override
    public List<BookInfo> selectByExample(BookInfoExample example) {
        return bookInfoMapper.selectByExample(example);
    }

    @Override
    public BookInfo selectByPrimaryKey(String bookId) {

        return bookInfoMapper.selectByPrimaryKey(bookId);
    }

    @Override
    public int updateByExampleSelective(BookInfo record, BookInfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(BookInfo record, BookInfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(BookInfo record) {
        return bookInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BookInfo record) {
        return bookInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<BookInfo> queryStudentsBySql(Map<String, Object> data) {
        return bookInfoMapper.queryStudentsBySql(data);
    }

    @Override
    public List<BookInfo> queryBookInfoBySql(Map<String, Object> data) {
        return bookInfoMapper.queryBookInfoBySql(data);
    }
}
