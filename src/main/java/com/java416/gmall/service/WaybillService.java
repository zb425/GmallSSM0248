package com.java416.gmall.service;

import com.java416.gmall.bean.Waybill;
import com.java416.gmall.bean.WaybillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WaybillService {
    int countByExample(WaybillExample example);

    int deleteByExample(WaybillExample example);

    int deleteByPrimaryKey(String waybillId);

    int insert(Waybill record);

    int insertSelective(Waybill record);

    List<Waybill> selectByExample(WaybillExample example);

    Waybill selectByPrimaryKey(String waybillId);

    int updateByExampleSelective(@Param("record") Waybill record, @Param("example") WaybillExample example);

    int updateByExample(@Param("record") Waybill record, @Param("example") WaybillExample example);

    int updateByPrimaryKeySelective(Waybill record);

    int updateByPrimaryKey(Waybill record);
}
