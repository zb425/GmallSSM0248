package com.java416.gmall.service;

import com.java416.gmall.bean.Address;
import com.java416.gmall.bean.AddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AddressService {

    int countByExample(AddressExample example);

    int deleteByExample(AddressExample example);

    int deleteByPrimaryKey(String addId);

    int insert(Address record);

    int insertSelective(Address record);

    List<Address> selectByExample(AddressExample example);

    Address selectByPrimaryKey(String addId);

    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    List<Address> queryAddressBySql(Map<String,Object> data);
}
