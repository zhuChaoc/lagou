package com.newer.mapper;

import com.newer.domain.Job;
import com.newer.domain.JobType;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
}
