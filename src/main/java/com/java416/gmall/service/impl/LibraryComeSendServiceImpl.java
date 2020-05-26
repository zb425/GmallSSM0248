package com.java416.gmall.service.impl;

import com.java416.gmall.bean.LibraryComeSend;
import com.java416.gmall.bean.LibraryComeSendExample;
import com.java416.gmall.dao.LibraryComeSendMapper;
import com.java416.gmall.service.LibraryComeSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryComeSendServiceImpl implements LibraryComeSendService {

    @Autowired
    private LibraryComeSendMapper libraryComeSendMapper;

    @Override
    public int countByExample(LibraryComeSendExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(LibraryComeSendExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String libraryCsId) {
        return 0;
    }

    @Override
    public int insert(LibraryComeSend record) {
        return libraryComeSendMapper.insert(record);
    }

    @Override
    public int insertSelective(LibraryComeSend record) {
        return 0;
    }

    @Override
    public List<LibraryComeSend> selectByExample(LibraryComeSendExample example) {
        return libraryComeSendMapper.selectByExample(example);
    }

    @Override
    public LibraryComeSend selectByPrimaryKey(String libraryCsId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(LibraryComeSend record, LibraryComeSendExample example) {
        return 0;
    }

    @Override
    public int updateByExample(LibraryComeSend record, LibraryComeSendExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(LibraryComeSend record) {
        return libraryComeSendMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LibraryComeSend record) {
        return 0;
    }
}
