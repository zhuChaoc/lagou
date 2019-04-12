package com.newer.domain;


import java.sql.Date;

/**
 * @Author：ningbo
 * @Date:2019/4/10
 * @Description:com.newer.domain
 * @Version:1.0
 */
public class Job {
    private Integer id;
    private Integer cpId;
    private String jobType;
    private String jobName;
    private String dname;
    private String jobQuality;
    private Integer minSal;
    private Integer maxSal;
    private String jobCity;
    private String jobExperience;
    private String jobEducation;
    private String jobLightPoint;

    private String jobInfo;
    private String jobAddress;
    private Date publishTime;
    private Integer state;
    private Integer subTimes;

    public Job() {

    }

    public Job(Integer cpId, String jobType, String jobName, String dname, String jobQuality, Integer minSal, Integer maxSal, String jobCity, String jobExperience, String jobEducation, String jobLightPoint, String jobInfo, String jobAddress) {
        this.cpId = cpId;
        this.jobType = jobType;
        this.jobName = jobName;
        this.dname = dname;
        this.jobQuality = jobQuality;
        this.minSal = minSal;
        this.maxSal = maxSal;
        this.jobCity = jobCity;
        this.jobExperience = jobExperience;
        this.jobEducation = jobEducation;
        this.jobLightPoint = jobLightPoint;
        this.jobInfo = jobInfo;
        this.jobAddress = jobAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
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

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSubTimes() {
        return subTimes;
    }

    public void setSubTimes(Integer subTimes) {
        this.subTimes = subTimes;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", cpId=" + cpId +
                ", jobType='" + jobType + '\'' +
                ", jobName='" + jobName + '\'' +
                ", dname='" + dname + '\'' +
                ", jobQuality='" + jobQuality + '\'' +
                ", minSal=" + minSal +
                ", maxSal=" + maxSal +
                ", jobCity='" + jobCity + '\'' +
                ", jobExperience='" + jobExperience + '\'' +
                ", jobEducation='" + jobEducation + '\'' +
                ", jobLightPoint='" + jobLightPoint + '\'' +
                ", jobInfo='" + jobInfo + '\'' +
                ", jobAddress='" + jobAddress + '\'' +
                ", publishTime=" + publishTime +
                ", state=" + state +
                ", subTimes=" + subTimes +
                '}';
    }
}
