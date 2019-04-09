package com.newer.service;
import com.newer.domain.Resume;
import org.apache.ibatis.annotations.Param;

public interface ResumeService {
    int updateMyDescribe(Resume resume);
    Resume selectMyDescribe( Integer reid);
    int updateRname(Resume resume);
    Resume selectRname(Integer reid);
    Resume selectResume(Integer jid);
}
