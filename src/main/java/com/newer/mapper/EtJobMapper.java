package com.newer.mapper;

import com.newer.domain.EtJob;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EtJobMapper {

    @Insert("insert into etjob values(null,#{city},#{jobType},#{expectJob},#{expectSal},#{reid})")
    int addEtJob(EtJob etJob);

    @Select("select * from etjob where reid=#{reid}")
    List<EtJob> selectEtJob(@Param("reid")int reid);
}
