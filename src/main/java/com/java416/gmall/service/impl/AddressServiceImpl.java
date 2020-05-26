package com.java416.gmall.service.impl;

import com.java416.gmall.bean.Address;
import com.java416.gmall.bean.AddressExample;
import com.java416.gmall.dao.AddressMapper;
import com.java416.gmall.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public int countByExample(AddressExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(AddressExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String addId) {
        return addressMapper.deleteByPrimaryKey(addId);
    }

    @Override
    public int insert(Address record) {
        return addressMapper.insert(record);
    }

    @Override
    public int insertSelective(Address record) {
        return 0;
    }

    @Override
    public List<Address> selectByExample(AddressExample example) {
        return addressMapper.selectByExample(example);
    }

    @Override
    public Address selectByPrimaryKey(String addId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Address record, AddressExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Address record, AddressExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Address record) {
        return addressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Address record) {
        return addressMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Address> queryAddressBySql(Map<String, Object> data) {
        return addressMapper.queryAddressBySql(data);
    }
}
