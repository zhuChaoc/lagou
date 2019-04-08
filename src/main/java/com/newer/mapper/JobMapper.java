package com.newer.mapper;

import com.newer.domain.Job;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface JobMapper {
   @ResultMap(value = "com.newer.mapper.JobMapper.job1")
   @Select("select a.id aid,a.*,c.id cid,c.* from job a left join company c on a.cpid=c.id where jobtype like #{jobType} or jobname like #{jobName} or cpname like #{cpName} order by Subtimes desc")
    List<Job> selectJobs(@Param("jobType")String jobType,@Param("jobName")String jobName,@Param("cpName")String cpName);
   @ResultMap(value = "com.newer.mapper.JobMapper.job1")
   @Select("select a.id aid,a.*,c.id cid,c.* from job a left join company c on a.cpid=c.id order by publishtime desc")
    List<Job> selectNewJobs();
    @ResultMap(value = "com.newer.mapper.JobMapper.job1")
    @Select("select a.id aid,a.*,c.id cid,c.* from job a left join company c on a.cpid=c.id where a.id=#{id}")
    Job findById(@Param("id") Integer id);

}
