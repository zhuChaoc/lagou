package com.newer.service;

import com.newer.domain.FirstJobTypeGroup;
import com.newer.domain.Job;
import com.newer.domain.JobType;
import com.newer.domain.SecondJobTypeGroup;
import com.newer.mapper.JobMapper;
import com.newer.mapper.JobTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：ningbo
 * @Date:2019/4/9
 * @Description:com.newer.service
 * @Version:1.0
 */
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class JobServiceImpl implements JobService {
    @Autowired
    private JobMapper jobMapper;

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addJob(Job job) {
        return jobMapper.addJob(job);
    }

    @Override
    public int checkcity(String cityName) {
        return jobMapper.checkcity(cityName);
    }

    @Override
    public List<Job> findAll(int cpId) {
        return jobMapper.findAll(cpId);
    }

    @Override
    public Job findById(int id, int cpId) {
        return jobMapper.findById(id,cpId);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int updatestate(int id, int cpId) {
        return jobMapper.updatestate(id,cpId);
    }

    @Override
    public int deletejob(int id) {
        return jobMapper.deletejob(id);
    }
}
