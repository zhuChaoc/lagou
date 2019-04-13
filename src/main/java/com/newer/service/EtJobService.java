package com.newer.service;

import com.newer.domain.EtJob;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EtJobService {

    //添加期望工作
    int addEtJob(EtJob etJob);
    //查询期望工作
    List<EtJob> selectEtJob(int reid);

    //删除期望工作
    int deleteEtJob(int id);

    //更新期望工作
    int updateEtJob(EtJob etJob);
}
