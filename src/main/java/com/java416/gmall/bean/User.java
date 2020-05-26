package com.java416.gmall.bean;

import java.util.Date;

public class User {
    private String uId;

    private String lId;

    private String uName;

    private String uPassword;

    private String uNice;

    private String uPhone;

    private String uEmail;

    private String uImage;

    private String uSex;

    private Integer uJifen;

    private Date uCreatime;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId == null ? null : lId.trim();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuNice() {
        return uNice;
    }

    public void setuNice(String uNice) {
        this.uNice = uNice == null ? null : uNice.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuImage() {
        return uImage;
    }

    public void setuImage(String uImage) {
        this.uImage = uImage == null ? null : uImage.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public Integer getuJifen() {
        return uJifen;
    }

    public void setuJifen(Integer uJifen) {
        this.uJifen = uJifen;
    }

    public Date getuCreatime() {
        return uCreatime;
    }

    public void setuCreatime(Date uCreatime) {
        this.uCreatime = uCreatime;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId='" + uId + '\'' +
                ", lId='" + lId + '\'' +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uNice='" + uNice + '\'' +
                ", uPhone='" + uPhone + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uImage='" + uImage + '\'' +
                ", uSex='" + uSex + '\'' +
                ", uJifen=" + uJifen +
                ", uCreatime=" + uCreatime +
                '}';
    }
}