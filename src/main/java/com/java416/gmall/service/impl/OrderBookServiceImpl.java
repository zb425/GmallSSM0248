package com.java416.gmall.service.impl;

import com.java416.gmall.bean.OrderBook;
import com.java416.gmall.bean.OrderBookExample;
import com.java416.gmall.dao.OrderBookMapper;
import com.java416.gmall.service.OrderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderBookServiceImpl implements OrderBookService {

    @Autowired
    private OrderBookMapper orderBookMapper;
    @Override
    public int countByExample(OrderBookExample example) {
        return orderBookMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OrderBookExample example) {
        return orderBookMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String oId) {
        return orderBookMapper.deleteByPrimaryKey(oId);
    }

    @Override
    public int insert(OrderBook record) {
        return orderBookMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderBook record) {
        return orderBookMapper.insertSelective(record);
    }

    @Override
    public List<OrderBook> selectByExample(OrderBookExample example) {
        return orderBookMapper.selectByExample(example);
    }

    @Override
    public OrderBook selectByPrimaryKey(String oId) {
        return orderBookMapper.selectByPrimaryKey(oId);
    }

    @Override
    public int updateByExampleSelective(OrderBook record, OrderBookExample example) {
        return orderBookMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(OrderBook record, OrderBookExample example) {
        return orderBookMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderBook record) {
        return orderBookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderBook record) {
        return orderBookMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<OrderBook> queryOrderBySql(Map<String, Object> data) {
        return orderBookMapper.queryOrderBySql(data);
    }
}
