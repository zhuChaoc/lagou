package com.newer.mapper;

import com.newer.domain.JobType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author：ningbo
 * @Date:2019/4/8
 * @Description:com.newer.mapper
 * @Version:1.0
 */
public interface JobTypeMapper {
    @Select("SELECT * FROM jobtype WHERE parentid IS NULL and status=1 order by seq asc")
    List<JobType>  findFirstType();

    @Select("SELECT * FROM jobtype WHERE parentid=#{parentid} and status=1  order by seq asc")
    List<JobType>  findChildByParentId(@Param("parentid") int parentid);


}
