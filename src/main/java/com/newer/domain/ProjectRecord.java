package com.newer.domain;

import java.io.Serializable;

public class ProjectRecord implements Serializable {
    private int pid;//项目经验ID
    private int reid;//关联简历表
    private String wname;//项目名称
    private String wjob;//项目职务
    private String beginYear;//开始年份
    private String  beginMonth;//开始月份
    private String  endYear;//结束年份
    private String  endMonth;//结束月份
    private String describe;//项目描述

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getReid() {
        return reid;
    }

    public void setReid(int reid) {
        this.reid = reid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getWjob() {
        return wjob;
    }

    public void setWjob(String wjob) {
        this.wjob = wjob;
    }

    public String getBeginYear() {
        return beginYear;
    }

    public void setBeginYear(String beginYear) {
        this.beginYear = beginYear;
    }

    public String getBeginMonth() {
        return beginMonth;
    }

    public void setBeginMonth(String beginMonth) {
        this.beginMonth = beginMonth;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
