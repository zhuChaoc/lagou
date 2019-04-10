package com.newer.service;

import com.newer.domain.EtJob;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EtJobService {

    //添加期望工作
    int addEtJob(EtJob etJob);

    //查询期望工作
    List<EtJob> selectEtJob(int id);
}
