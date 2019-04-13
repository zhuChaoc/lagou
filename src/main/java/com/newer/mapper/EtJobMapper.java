package com.newer.mapper;

import com.newer.domain.EtJob;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface EtJobMapper {

    @Insert("insert into etjob values(null,#{city},#{jobType},#{expectJob},#{expectSal},#{reid})")
    int addEtJob(EtJob etJob);

    @Select("select * from etjob where reid=#{reid}")
    List<EtJob> selectEtJob(@Param("reid")int reid);

    @Delete("delete  from etjob where id=#{id}")
    int deleteEtJob(@Param("id") int id);

    @Update("update etjob set city=#{city},jobType=#{jobType},expectJob=#{expectJob},expectSal=#{expectSal} where id=#{id}")
    int updateEtJob(EtJob etJob);
}
