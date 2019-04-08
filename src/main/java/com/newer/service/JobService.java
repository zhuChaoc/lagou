package com.newer.service;

import com.newer.domain.Job;

import java.util.List;

public interface JobService {
    List<Job> selectJobs(String jobType,String jobName,String cpName);
    List<Job> selectNewJobs();
    Job findById(Integer id);
}
