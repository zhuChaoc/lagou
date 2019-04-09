package com.newer.service;

import com.newer.domain.Resume;
import com.newer.mapper.CompanyMapper;
import com.newer.mapper.ResumeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeMapper resumeMapper;
    @Override
    public int updateMyDescribe(Resume resume) {
        return resumeMapper.updateMyDescribe(resume);
    }

    @Override
    public Resume selectMyDescribe(Integer reid) {
        return resumeMapper.selectMyDescribe(reid);
    }
}
