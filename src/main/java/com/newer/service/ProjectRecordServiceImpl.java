package com.newer.service;

import com.newer.domain.ProjectRecord;
import com.newer.mapper.JobSeekerMapper;
import com.newer.mapper.ProjectRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class ProjectRecordServiceImpl implements ProjectRecordService {

    @Autowired
    private ProjectRecordMapper projectRecordMapper;

    @Override
    public int addProjectRecord(ProjectRecord projectRecord) {
        return projectRecordMapper.addProjectRecord(projectRecord);
    }

    @Override
    public List<ProjectRecord> selectProjectRecord(Integer reid) {
        return projectRecordMapper.selectProjectRecord(reid);
    }

    @Override
    public int deleteProjectRecord(Integer pid) {
        return projectRecordMapper.deleteProjectRecord(pid);
    }
}
