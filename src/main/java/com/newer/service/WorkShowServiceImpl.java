package com.newer.service;

import com.newer.domain.WorkShow;
import com.newer.mapper.WorkShowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class WorkShowServiceImpl implements WorkShowService{
    @Autowired
    private WorkShowMapper workShowMapper;
    @Override
    public int addWorkShow(WorkShow workShow) {
        return workShowMapper.addWorkShow(workShow);
    }

    @Override
    public List<WorkShow> selectWorkShow(Integer reid) {
        return workShowMapper.selectWorkShow(reid);
    }
}
