package com.java416.gmall.bean;

import java.util.Date;

public class OrderBook {
    private String oId;

    private String bookId;

    private String libraryCsId;

    private String uId;

    private String oCode;

    private Float oTotal;

    private Float oPay;

    private Float oRetrun;

    private Float oDiscount;

    private Integer oPaly;

    private Integer oState;

    private String oWuliucode;

    private Integer oJf;

    private String oMomer;

    private Integer oSSstate;

    private Date oCreatetime;

    private Date oCCreatetime;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    public String getLibraryCsId() {
        return libraryCsId;
    }

    public void setLibraryCsId(String libraryCsId) {
        this.libraryCsId = libraryCsId == null ? null : libraryCsId.trim();
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getoCode() {
        return oCode;
    }

    public void setoCode(String oCode) {
        this.oCode = oCode == null ? null : oCode.trim();
    }

    public Float getoTotal() {
        return oTotal;
    }

    public void setoTotal(Float oTotal) {
        this.oTotal = oTotal;
    }

    public Float getoPay() {
        return oPay;
    }

    public void setoPay(Float oPay) {
        this.oPay = oPay;
    }

    public Float getoRetrun() {
        return oRetrun;
    }

    public void setoRetrun(Float oRetrun) {
        this.oRetrun = oRetrun;
    }

    public Float getoDiscount() {
        return oDiscount;
    }

    public void setoDiscount(Float oDiscount) {
        this.oDiscount = oDiscount;
    }

    public Integer getoPaly() {
        return oPaly;
    }

    public void setoPaly(Integer oPaly) {
        this.oPaly = oPaly;
    }

    public Integer getoState() {
        return oState;
    }

    public void setoState(Integer oState) {
        this.oState = oState;
    }

    public String getoWuliucode() {
        return oWuliucode;
    }

    public void setoWuliucode(String oWuliucode) {
        this.oWuliucode = oWuliucode == null ? null : oWuliucode.trim();
    }

    public Integer getoJf() {
        return oJf;
    }

    public void setoJf(Integer oJf) {
        this.oJf = oJf;
    }

    public String getoMomer() {
        return oMomer;
    }

    public void setoMomer(String oMomer) {
        this.oMomer = oMomer == null ? null : oMomer.trim();
    }

    public Integer getoSSstate() {
        return oSSstate;
    }

    public void setoSSstate(Integer oSSstate) {
        this.oSSstate = oSSstate;
    }

    public Date getoCreatetime() {
        return oCreatetime;
    }

    public void setoCreatetime(Date oCreatetime) {
        this.oCreatetime = oCreatetime;
    }

    public Date getoCCreatetime() {
        return oCCreatetime;
    }

    public void setoCCreatetime(Date oCCreatetime) {
        this.oCCreatetime = oCCreatetime;
    }
}