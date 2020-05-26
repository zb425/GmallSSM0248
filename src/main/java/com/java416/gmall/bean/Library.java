package com.java416.gmall.bean;

import java.util.Date;

public class Library {
    private String libraryId;

    private String libraryName;

    private String libraryAddress;

    private String libraryCode;

    private Date libraryCreattime;

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId == null ? null : libraryId.trim();
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName == null ? null : libraryName.trim();
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress == null ? null : libraryAddress.trim();
    }

    public String getLibraryCode() {
        return libraryCode;
    }

    public void setLibraryCode(String libraryCode) {
        this.libraryCode = libraryCode == null ? null : libraryCode.trim();
    }

    public Date getLibraryCreattime() {
        return libraryCreattime;
    }

    public void setLibraryCreattime(Date libraryCreattime) {
        this.libraryCreattime = libraryCreattime;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryId='" + libraryId + '\'' +
                ", libraryName='" + libraryName + '\'' +
                ", libraryAddress='" + libraryAddress + '\'' +
                ", libraryCode='" + libraryCode + '\'' +
                ", libraryCreattime=" + libraryCreattime +
                '}';
    }
}