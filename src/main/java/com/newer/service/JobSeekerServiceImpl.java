package com.newer.service;

import com.newer.domain.JobSeeker;
import com.newer.mapper.JobSeekerMapper;
import com.newer.service.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class JobSeekerServiceImpl implements JobSeekerService {
    @Autowired
    private JobSeekerMapper jobSeekerMapper;
    @Override
    public int insertJobSeeker(JobSeeker jobSeeker) {
        return jobSeekerMapper.addJobSeeker(jobSeeker);
    }

    @Override
    public int selectEamil(String EMAIL) {
        return jobSeekerMapper.selectEamil(EMAIL);
    }

    @Override
    public JobSeeker selectJobSeeker(String EMAIL, String PWD) {
        return jobSeekerMapper.selectJobSeeker(EMAIL,PWD);
    }

    @Override
    public int updateJobSeeker(JobSeeker jobSeeker) {
        return jobSeekerMapper.updateJobSeeker(jobSeeker);
    }

    @Override
    public int updatePic(JobSeeker jobSeeker) {
        return jobSeekerMapper.updatePic(jobSeeker);
    }
}
