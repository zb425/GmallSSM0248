package com.java416.gmall.bean;

import java.io.Serializable;

public class BookKind {
    private String bId;

    private String bName;

    private Integer bState;

    private Integer bCount;

    private String bMsg;

    public BookKind() {
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public Integer getbState() {
        return bState;
    }

    public void setbState(Integer bState) {
        this.bState = bState;
    }

    public Integer getbCount() {
        return bCount;
    }

    public void setbCount(Integer bCount) {
        this.bCount = bCount;
    }

    public String getbMsg() {
        return bMsg;
    }

    public void setbMsg(String bMsg) {
        this.bMsg = bMsg == null ? null : bMsg.trim();
    }

    @Override
    public String toString() {
        return "BookKind{" +
                "bId='" + bId + '\'' +
                ", bName='" + bName + '\'' +
                ", bState=" + bState +
                ", bCount=" + bCount +
                ", bMsg='" + bMsg + '\'' +
                '}';
    }
}