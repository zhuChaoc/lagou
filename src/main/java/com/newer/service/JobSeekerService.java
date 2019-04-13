package com.newer.service;

import com.newer.domain.JobSeeker;


public interface JobSeekerService {
    int insertJobSeeker(JobSeeker jobSeeker);
    int selectEamil(String EMAIL);
    JobSeeker selectJobSeeker(String EMAIL,String PWD);
    int updateJobSeeker(JobSeeker jobSeeker);
    int updatePic(JobSeeker jobSeeker);
}
