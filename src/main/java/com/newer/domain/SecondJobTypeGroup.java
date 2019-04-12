package com.newer.domain;

import java.util.List;

/**
 * @Author：ningbo
 * @Date:2019/4/9
 * @Description:com.newer.domain
 * @Version:1.0
 */
public class SecondJobTypeGroup {
    private JobType jobType;
    private List<JobType> jobTypes;

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public List<JobType> getJobTypes() {
        return jobTypes;
    }

    public void setJobTypes(List<JobType> jobTypes) {
        this.jobTypes = jobTypes;
    }
}
