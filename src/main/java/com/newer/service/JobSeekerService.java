package com.newer.service;

import com.newer.domain.JobSeeker;


public interface JobSeekerService {
    int insertJobSeeker(JobSeeker jobSeeker);
    int selectEamil(String EMAIL);
}
