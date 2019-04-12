package com.newer.domain;

import java.util.List;

/**
 * @Author：ningbo
 * @Date:2019/4/9
 * @Description:com.newer.domain
 * @Version:1.0
 */
public class FirstJobTypeGroup {
    private JobType jobType;
    private List<SecondJobTypeGroup> secondJobTypes;

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public List<SecondJobTypeGroup> getSecondJobTypes() {
        return secondJobTypes;
    }

    public void setSecondJobTypes(List<SecondJobTypeGroup> secondJobTypes) {
        this.secondJobTypes = secondJobTypes;
    }
}
