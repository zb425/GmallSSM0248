package com.java416.gmall.service.impl;

import com.java416.gmall.bean.Waybill;
import com.java416.gmall.bean.WaybillExample;
import com.java416.gmall.dao.WaybillMapper;
import com.java416.gmall.service.WaybillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaybillServiceImpl implements WaybillService {
    @Autowired
    private WaybillMapper waybillMapper;

    @Override
    public int countByExample(WaybillExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(WaybillExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String waybillId) {
        return 0;
    }

    @Override
    public int insert(Waybill record) {
        return waybillMapper.insert(record);
    }

    @Override
    public int insertSelective(Waybill record) {
        return 0;
    }

    @Override
    public List<Waybill> selectByExample(WaybillExample example) {
        return null;
    }

    @Override
    public Waybill selectByPrimaryKey(String waybillId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Waybill record, WaybillExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Waybill record, WaybillExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Waybill record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Waybill record) {
        return 0;
    }
}
