package com.java416.gmall.bean;

public class BookInfo {
    private String bookId;

    private String bId;

    private String bookName;

    private String bookAuth;

    private Integer bookTotal;

    private Integer bookState;

    private Float bookPrice;

    private String bookMsg;

    private Integer bookSales;

    private String bookImg;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookAuth() {
        return bookAuth;
    }

    public void setBookAuth(String bookAuth) {
        this.bookAuth = bookAuth == null ? null : bookAuth.trim();
    }

    public Integer getBookTotal() {
        return bookTotal;
    }

    public void setBookTotal(Integer bookTotal) {
        this.bookTotal = bookTotal;
    }

    public Integer getBookState() {
        return bookState;
    }

    public void setBookState(Integer bookState) {
        this.bookState = bookState;
    }

    public Float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookMsg() {
        return bookMsg;
    }

    public void setBookMsg(String bookMsg) {
        this.bookMsg = bookMsg == null ? null : bookMsg.trim();
    }

    public Integer getBookSales() {
        return bookSales;
    }

    public void setBookSales(Integer bookSales) {
        this.bookSales = bookSales;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg == null ? null : bookImg.trim();
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bookId='" + bookId + '\'' +
                ", bId='" + bId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookAuth='" + bookAuth + '\'' +
                ", bookTotal=" + bookTotal +
                ", bookState=" + bookState +
                ", bookPrice=" + bookPrice +
                ", bookMsg='" + bookMsg + '\'' +
                ", bookSales=" + bookSales +
                ", bookImg='" + bookImg + '\'' +
                '}';
    }
}