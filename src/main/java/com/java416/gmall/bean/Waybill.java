package com.java416.gmall.bean;

import java.util.Date;

public class Waybill {
    private String waybillId;

    private String libraryCsId;

    private Date createTime;

    private String aId;

    private Integer wStatue;

    public String getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(String waybillId) {
        this.waybillId = waybillId == null ? null : waybillId.trim();
    }

    public String getLibraryCsId() {
        return libraryCsId;
    }

    public void setLibraryCsId(String libraryCsId) {
        this.libraryCsId = libraryCsId == null ? null : libraryCsId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId == null ? null : aId.trim();
    }

    public Integer getwStatue() {
        return wStatue;
    }

    public void setwStatue(Integer wStatue) {
        this.wStatue = wStatue;
    }
}