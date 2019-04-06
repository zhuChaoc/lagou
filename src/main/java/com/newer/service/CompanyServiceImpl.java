package com.newer.service;

import com.newer.domain.Company;
import com.newer.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class CompanyServiceImpl implements CompanyService{
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public Company selectCompany(Integer id) {
        return companyMapper.selectCompany(id);
    }
}
