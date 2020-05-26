package com.java416.gmall.service.impl;

import com.java416.gmall.bean.Library;
import com.java416.gmall.bean.LibraryExample;
import com.java416.gmall.dao.LibraryMapper;
import com.java416.gmall.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    private LibraryMapper libraryMapper;

    @Override
    public int countByExample(LibraryExample example) {
        return libraryMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LibraryExample example) {
        return libraryMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String libraryId) {
        return libraryMapper.deleteByPrimaryKey(libraryId);
    }

    @Override
    public int insert(Library record) {
        return libraryMapper.insert(record);
    }

    @Override
    public int insertSelective(Library record) {
        return libraryMapper.insertSelective(record);
    }

    @Override
    public List<Library> selectByExample(LibraryExample example) {
        return libraryMapper.selectByExample(example);
    }

    @Override
    public Library selectByPrimaryKey(String libraryId) {
        return libraryMapper.selectByPrimaryKey(libraryId);
    }

    @Override
    public int updateByExampleSelective(Library record, LibraryExample example) {
        return libraryMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Library record, LibraryExample example) {
        return libraryMapper.updateByExample(record,example);

    }

    @Override
    public int updateByPrimaryKeySelective(Library record) {
        return libraryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Library record) {
        return libraryMapper.updateByPrimaryKey(record);
    }
}
