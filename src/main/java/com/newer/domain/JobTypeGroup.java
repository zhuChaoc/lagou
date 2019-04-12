package com.newer.domain;

import java.util.List;

/**
 * @Author：ningbo
 * @Date:2019/4/8
 * @Description:com.newer.domain：工作类别组合类
 * @Version:1.0
 */
public class JobTypeGroup {
    private JobType jobType;// 父类型
    private List<JobTypeGroup> childJobTypeList;

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public List<JobTypeGroup> getChildJobTypeList() {
        return childJobTypeList;
    }

    public void setChildJobTypeList(List<JobTypeGroup> childJobTypeList) {
        this.childJobTypeList = childJobTypeList;
    }
}
