package com.newer.service;

import com.newer.domain.EduRecord;
import com.newer.mapper.EduRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class EduRecordServiceImpl implements EduRecordService {
    @Autowired
  private EduRecordMapper eduRecordMapper;

    @Override
    public int updateEduRecord(EduRecord eduRecord) {
        return eduRecordMapper.updateEduRecord(eduRecord);
    }

    @Override
    public List<EduRecord> selectEduRecord(Integer reid) {
        return  eduRecordMapper.selectEduRecord(reid);
    }
}
