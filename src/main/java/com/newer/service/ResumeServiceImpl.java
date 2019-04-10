package com.newer.service;

import com.newer.domain.*;
import com.newer.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeMapper resumeMapper;
    @Autowired
    private ProjectRecordMapper projectRecordMapper;
    @Autowired
    private WorkRecordMapper workRecordMapper;
    @Autowired
    private WorkShowMapper workShowMapper;
    @Autowired
    private EduRecordMapper eduRecordMapper;
    @Autowired
    private EtJobMapper etJobMapper;
    @Override
    public int updateMyDescribe(Resume resume) {
        return resumeMapper.updateMyDescribe(resume);
    }

    @Override
    public Resume selectMyDescribe(Integer reid) {
        return resumeMapper.selectMyDescribe(reid);
    }

    @Override
    public int updateRname(Resume resume) {
        return resumeMapper.updateRname(resume);
    }

    @Override
    public Resume selectRname(Integer reid) {
        return resumeMapper.selectRname(reid);
    }

    @Override
    public Resume selectResume(Integer jid) {
        Resume resume=resumeMapper.selectResume(jid);
        Integer reid=resume.getReid();
        List<EtJob> etJobs=etJobMapper.selectEtJob(reid);
        resume.setEtJobs(etJobs);
        List<ProjectRecord> projectRecords=projectRecordMapper.selectProjectRecord(reid);
        resume.setProjectRecords(projectRecords);
        List<WorkShow> workShows=workShowMapper.selectWorkShow(reid);
        resume.setWorkShows(workShows);
        List<WorkRecord> workRecords=workRecordMapper.selectWorkRecord(reid);
        resume.setWorkRecords(workRecords);
        List<EduRecord> eduRecords=eduRecordMapper.selectEduRecord(reid);
        resume.setEduRecords(eduRecords);
        return resume;
    }
}
