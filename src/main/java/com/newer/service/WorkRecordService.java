package com.newer.service;

import com.newer.domain.WorkRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkRecordService {
    int addWorkRecord(WorkRecord workRecord);
    List<WorkRecord> selectWorkRecord(Integer reid);
}
