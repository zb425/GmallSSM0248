package com.java416.gmall.bean;

public class Address {
    private String addId;

    private String uId;

    private String addName;

    private String addPhone;

    private String addCode;

    private String addProvince;

    private String addCicty;

    private String addArea;

    private String addAdderss;

    private Integer addTF;

    public String getAddId() {
        return addId;
    }

    public void setAddId(String addId) {
        this.addId = addId == null ? null : addId.trim();
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName == null ? null : addName.trim();
    }

    public String getAddPhone() {
        return addPhone;
    }

    public void setAddPhone(String addPhone) {
        this.addPhone = addPhone == null ? null : addPhone.trim();
    }

    public String getAddCode() {
        return addCode;
    }

    public void setAddCode(String addCode) {
        this.addCode = addCode == null ? null : addCode.trim();
    }

    public String getAddProvince() {
        return addProvince;
    }

    public void setAddProvince(String addProvince) {
        this.addProvince = addProvince == null ? null : addProvince.trim();
    }

    public String getAddCicty() {
        return addCicty;
    }

    public void setAddCicty(String addCicty) {
        this.addCicty = addCicty == null ? null : addCicty.trim();
    }

    public String getAddArea() {
        return addArea;
    }

    public void setAddArea(String addArea) {
        this.addArea = addArea == null ? null : addArea.trim();
    }

    public String getAddAdderss() {
        return addAdderss;
    }

    public void setAddAdderss(String addAdderss) {
        this.addAdderss = addAdderss == null ? null : addAdderss.trim();
    }

    public Integer getAddTF() {
        return addTF;
    }

    public void setAddTF(Integer addTF) {
        this.addTF = addTF;
    }
}