package com.newer.domain;

import java.io.Serializable;
import java.sql.Date;

public class Job implements Serializable {
    private Integer id;//职位id
    private String jobType;//职位类型
    private String jobName;//职位名
    private String dName;//部门名
    private String jobQuality;//工作性质
    private Integer minSal;//最低工资
    private Integer maxSal;//最高工资
    private String jobCity;//工作城市
    private String jobExperience;//工作经验
    private String jobEducation;//学历要求
    private String jobLightPoint;//职位亮点
    private String jobInfo;//职位描述
    private String jobAddress;//工作地址
    private Date publishTime;//发布时间
    private String state;//职位状态
    private Integer subTimes;//订阅次数
    private Integer cpid;//公司
    public Job() {
    }

    public Integer getCpid() {
        return cpid;
    }

    public void setCpid(Integer cpid) {
        this.cpid = cpid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getJobQuality() {
        return jobQuality;
    }

    public void setJobQuality(String jobQuality) {
        this.jobQuality = jobQuality;
    }

    public Integer getMinSal() {
        return minSal;
    }

    public void setMinSal(Integer minSal) {
        this.minSal = minSal;
    }

    public Integer getMaxSal() {
        return maxSal;
    }

    public void setMaxSal(Integer maxSal) {
        this.maxSal = maxSal;
    }

    public String getJobCity() {
        return jobCity;
    }

    public void setJobCity(String jobCity) {
        this.jobCity = jobCity;
    }

    public String getJobExperience() {
        return jobExperience;
    }

    public void setJobExperience(String jobExperience) {
        this.jobExperience = jobExperience;
    }

    public String getJobEducation() {
        return jobEducation;
    }

    public void setJobEducation(String jobEducation) {
        this.jobEducation = jobEducation;
    }

    public String getJobLightPoint() {
        return jobLightPoint;
    }

    public void setJobLightPoint(String jobLightPoint) {
        this.jobLightPoint = jobLightPoint;
    }

    public String getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(String jobInfo) {
        this.jobInfo = jobInfo;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getSubTimes() {
        return subTimes;
    }

    public void setSubTimes(Integer subTimes) {

        this.subTimes = subTimes;
    }
}
