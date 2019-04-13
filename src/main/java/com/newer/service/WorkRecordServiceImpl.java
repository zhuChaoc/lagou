package com.newer.service;

import com.newer.domain.WorkRecord;
import com.newer.domain.WorkShow;
import com.newer.mapper.WorkRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class WorkRecordServiceImpl implements WorkRecordService{
    @Autowired
    private WorkRecordMapper workRecordMapper;

    @Override
    public int addWorkRecord(WorkRecord workRecord) {
        return workRecordMapper.addWorkRecord(workRecord);
    }

    @Override
    public List<WorkRecord> selectWorkRecord(Integer reid) {
        return workRecordMapper.selectWorkRecord(reid);
    }

    @Override
    public int deleteWorkRecord(int wid) {
        return workRecordMapper.deleteWorkRecord(wid);
    }
}
