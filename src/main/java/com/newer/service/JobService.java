package com.newer.service;

import com.newer.domain.FirstJobTypeGroup;
import com.newer.domain.Job;

import java.util.List;

/**
 * @Author：ningbo
 * @Date:2019/4/9
 * @Description:com.newer.service
 * @Version:1.0
 */
public interface JobService {
    int addJob(Job job);

    int checkcity(String cityName);

    List<Job>findAll(int cpId);

    Job findById(int id,int cpId);

    int updatestate(int id,int cpId);

    int deletejob(int id);
}
