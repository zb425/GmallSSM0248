package com.java416.gmall.service;

import com.java416.gmall.bean.OrderBook;
import com.java416.gmall.bean.OrderBookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrderBookService {

    int countByExample(OrderBookExample example);

    int deleteByExample(OrderBookExample example);

    int deleteByPrimaryKey(String oId);

    int insert(OrderBook record);

    int insertSelective(OrderBook record);

    List<OrderBook> selectByExample(OrderBookExample example);

    OrderBook selectByPrimaryKey(String oId);

    int updateByExampleSelective(@Param("record") OrderBook record, @Param("example") OrderBookExample example);

    int updateByExample(@Param("record") OrderBook record, @Param("example") OrderBookExample example);

    int updateByPrimaryKeySelective(OrderBook record);

    int updateByPrimaryKey(OrderBook record);

    List<OrderBook> queryOrderBySql(Map<String,Object> data);
}
