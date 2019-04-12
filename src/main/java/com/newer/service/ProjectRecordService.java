package com.newer.service;

import com.newer.domain.ProjectRecord;

import java.util.List;

public interface ProjectRecordService {
    int addProjectRecord(ProjectRecord projectRecord);
    List<ProjectRecord> selectProjectRecord(Integer reid);
    int deleteProjectRecord(Integer pid);
}
