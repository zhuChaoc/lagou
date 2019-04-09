package com.newer.service;

import com.newer.domain.EduRecord;

import java.util.List;

public interface EduRecordService {
    int updateEduRecord(EduRecord eduRecord);
    List<EduRecord> selectEduRecord(Integer reid);
}
