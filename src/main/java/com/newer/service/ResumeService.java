package com.newer.service;

import com.newer.domain.Resume;

public interface ResumeService {
    int updateMyDescribe(Resume resume);
    Resume selectMyDescribe( Integer reid);
}
