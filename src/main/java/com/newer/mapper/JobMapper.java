package com.newer.mapper;

import com.newer.domain.Job;
import com.newer.domain.JobType;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author：ningbo
 * @Date:2019/4/8
 * @Description:com.newer.mapper
 * @Version:1.0
 */
public interface JobMapper {

    @Insert("INSERT INTO job VALUES(NULL,#{cpId},#{jobType},#{jobName},#{dname}," +
            "#{jobQuality},#{minSal},#{maxSal},#{jobCity},#{jobExperience}," +
            "#{jobEducation},#{jobLightPoint},#{jobInfo},#{jobAddress},current_date(),1,0)")
    int addJob(Job job);

    @Select("select count(cityname) from lagou.checkcity where cityname=#{cityName}")
     int checkcity(@Param("cityName")String cityName);

    @Select("select * from lagou.job where cpid=#{cpId}")
    List<Job>findAll(@Param("cpId")int cpId);

    @Select("select * from lagou.job where id=#{id} and cpid={cpId}")
    Job findById(@Param("id")int id,@Param("cpId")int cpId);

    @Update("update lagou.job set state=abs(state-1) where id=#{id} and cpid=#{cpId}")
    int updatestate(@Param("id")int id,@Param("cpId")int cpId);

    @Delete("delete from lagou.job where id=#{id}")
    int deletejob(@Param("id")int id);
}
