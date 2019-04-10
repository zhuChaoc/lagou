package com.newer.service;

import com.newer.domain.EtJob;
import com.newer.mapper.EtJobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class EtJobServiceImp implements EtJobService {
    @Autowired
    private EtJobMapper etJobMapper;
    @Override
    public int addEtJob(EtJob etJob) {
        return etJobMapper.addEtJob(etJob);
    }

    @Override
    public List<EtJob> selectEtJob(int id) {
        return etJobMapper.selectEtJob(id);
    }
}
