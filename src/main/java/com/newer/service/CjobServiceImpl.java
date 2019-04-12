package com.newer.service;

import com.newer.domain.Cjob;
import com.newer.mapper.CjobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class CjobServiceImpl implements CjobService{
    @Autowired
    private CjobMapper cjobMapper;
    @Override
    public List<Cjob> selectCjob(Integer jsid) {
        return cjobMapper.selectCjob(jsid);
    }

    @Override
    public int insertCjob(Integer jsid, Integer jid) {
        return cjobMapper.insertCjob(jsid,jid);
    }

    @Override
    public int deleteCjob(Integer jsid, Integer jid) {
        return cjobMapper.deleteCjob(jsid, jid);
    }
}
