package com.newer.domain;

import java.io.Serializable;

public class JobSeeker implements Serializable {
    private Integer JID;
    private String EMAIL;
    private String PWD;
    private String JNAME;
    private String AGE;
    private String EDUCATION;
    private String WORKTIME;
    private String MOBILE;
    private String CITY;
    private String SEEKER_PIC;//目标工作

    public Integer getJID() {
        return JID;
    }

    public void setJID(Integer JID) {
        this.JID = JID;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPWD() {
        return PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD;
    }

    public String getJNAME() {
        return JNAME;
    }

    public void setJNAME(String JNAME) {
        this.JNAME = JNAME;
    }

    public String getAGE() {
        return AGE;
    }

    public void setAGE(String AGE) {
        this.AGE = AGE;
    }

    public String getEDUCATION() {
        return EDUCATION;
    }

    public void setEDUCATION(String EDUCATION) {
        this.EDUCATION = EDUCATION;
    }

    public String getWORKTIME() {
        return WORKTIME;
    }

    public void setWORKTIME(String WORKTIME) {
        this.WORKTIME = WORKTIME;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSEEKER_PIC() {
        return SEEKER_PIC;
    }

    public void setSEEKER_PIC(String SEEKER_PIC) {
        this.SEEKER_PIC = SEEKER_PIC;
    }
}
