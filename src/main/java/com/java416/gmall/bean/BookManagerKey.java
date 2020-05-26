package com.java416.gmall.bean;

public class BookManagerKey {
    private String libraryId;

    private String bId;

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId == null ? null : libraryId.trim();
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }
}