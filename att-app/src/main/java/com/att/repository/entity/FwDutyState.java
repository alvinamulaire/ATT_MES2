package com.att.repository.entity;

import java.io.Serializable;
import java.util.Date;

public class FwDutyState implements Serializable {
    private String sid;

    private String site;

    private String workCenter;

    private String resrce;

    private String userNo;

    private Date clockInTime;

    private static final long serialVersionUID = 1L;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getWorkCenter() {
        return workCenter;
    }

    public void setWorkCenter(String workCenter) {
        this.workCenter = workCenter;
    }

    public String getResrce() {
        return resrce;
    }

    public void setResrce(String resrce) {
        this.resrce = resrce;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public Date getClockInTime() {
        return clockInTime;
    }

    public void setClockInTime(Date clockInTime) {
        this.clockInTime = clockInTime;
    }
}