package com.newer.mapper;

import com.newer.domain.Job;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface JobMapper {
    @Select("select * from job where jobtype like #{jobType} and jobname like #{jobName}")
    List<Job> selectJobs(@Param("jobType")String jobType,@Param("jobName")String jobName);
}
