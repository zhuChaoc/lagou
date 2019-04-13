package com.newer.domain;

import java.io.Serializable;

/**
 * 工作经历表
 */
public class WorkRecord implements Serializable {
    private int wid;
    private int reid;//简历表id
    private String companyName;//公司名称
    private String jobName;//职位名称
    private String workBeginYear;//工作开始年份
    private String workBeginMonth;//工作开始月份
    private String workEndYear;//工作结束年份
    private String workEndMonth;//工作结束月份

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public int getReid() {
        return reid;
    }

    public void setReid(int reid) {
        this.reid = reid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getWorkBeginYear() {
        return workBeginYear;
    }

    public void setWorkBeginYear(String workBeginYear) {
        this.workBeginYear = workBeginYear;
    }

    public String getWorkBeginMonth() {
        return workBeginMonth;
    }

    public void setWorkBeginMonth(String workBeginMonth) {
        this.workBeginMonth = workBeginMonth;
    }

    public String getWorkEndYear() {
        return workEndYear;
    }

    public void setWorkEndYear(String workEndYear) {
        this.workEndYear = workEndYear;
    }

    public String getWorkEndMonth() {
        return workEndMonth;
    }

    public void setWorkEndMonth(String workEndMonth) {
        this.workEndMonth = workEndMonth;
    }
}
