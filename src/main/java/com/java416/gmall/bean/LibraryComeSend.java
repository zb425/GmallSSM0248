package com.java416.gmall.bean;

import java.util.Date;

public class LibraryComeSend {
    private String libraryCsId;

    private String libraryId;

    private String libraryCsName;

    private Integer libraryCsType;

    private Integer libraryCsCount;

    private String libraryCsMsg;

    private Date libraryCsTime;

    public String getLibraryCsId() {
        return libraryCsId;
    }

    public void setLibraryCsId(String libraryCsId) {
        this.libraryCsId = libraryCsId == null ? null : libraryCsId.trim();
    }

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId == null ? null : libraryId.trim();
    }

    public String getLibraryCsName() {
        return libraryCsName;
    }

    public void setLibraryCsName(String libraryCsName) {
        this.libraryCsName = libraryCsName == null ? null : libraryCsName.trim();
    }

    public Integer getLibraryCsType() {
        return libraryCsType;
    }

    public void setLibraryCsType(Integer libraryCsType) {
        this.libraryCsType = libraryCsType;
    }

    public Integer getLibraryCsCount() {
        return libraryCsCount;
    }

    public void setLibraryCsCount(Integer libraryCsCount) {
        this.libraryCsCount = libraryCsCount;
    }

    public String getLibraryCsMsg() {
        return libraryCsMsg;
    }

    public void setLibraryCsMsg(String libraryCsMsg) {
        this.libraryCsMsg = libraryCsMsg == null ? null : libraryCsMsg.trim();
    }

    public Date getLibraryCsTime() {
        return libraryCsTime;
    }

    public void setLibraryCsTime(Date libraryCsTime) {
        this.libraryCsTime = libraryCsTime;
    }
}