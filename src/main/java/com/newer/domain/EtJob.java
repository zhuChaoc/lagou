package com.newer.domain;

import java.io.Serializable;

public class EtJob implements Serializable {
    private int id;
    private String city; //期望城市
    private String jobType;//工作类型
    private String expectJob;//期望职位
    private String expectSal;//期望薪水

    public EtJob() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getExpectJob() {
        return expectJob;
    }

    public void setExpectJob(String expectJob) {
        this.expectJob = expectJob;
    }

    public String getExpectSal() {
        return expectSal;
    }

    public void setExpectSal(String expectSal) {
        this.expectSal = expectSal;
    }
}
