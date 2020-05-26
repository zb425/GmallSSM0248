package com.java416.gmall.bean;

import java.io.Serializable;

public class UserLevel implements Serializable {
    private String lId;

    private String lName;

    private Integer lCzzhi;

    private Float lDiscount;

    private String lMeber;

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId == null ? null : lId.trim();
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName == null ? null : lName.trim();
    }

    public Integer getlCzzhi() {
        return lCzzhi;
    }

    public void setlCzzhi(Integer lCzzhi) {
        this.lCzzhi = lCzzhi;
    }

    public Float getlDiscount() {
        return lDiscount;
    }

    public void setlDiscount(Float lDiscount) {
        this.lDiscount = lDiscount;
    }

    public String getlMeber() {
        return lMeber;
    }

    public void setlMeber(String lMeber) {
        this.lMeber = lMeber == null ? null : lMeber.trim();
    }
}