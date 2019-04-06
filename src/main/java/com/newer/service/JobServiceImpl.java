package com.newer.service;

import com.newer.domain.Job;
import com.newer.mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class JobServiceImpl implements JobService{
    @Autowired
    private JobMapper jobMapper;
    @Override
    public List<Job> selectJobs(String jobType, String jobName) {
        return jobMapper.selectJobs(jobType,jobName);
    }

    @Override
    public List<Job> selectNewJobs() {
        return jobMapper.selectNewJobs();
    }
}
