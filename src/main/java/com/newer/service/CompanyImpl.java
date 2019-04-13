package com.newer.service;

import com.newer.domain.Company;
import com.newer.domain.CpProduct;
import com.newer.domain.CrTeam;
import com.newer.mapper.CompanyMapper;
import com.newer.mapper.UserCompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class CompanyImpl implements  CompanyService{
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private UserCompanyMapper userCompanyMapper;
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addCompany1(String cpPhone, String cpEmail, int userId) {

        companyMapper.addCompany1(cpPhone,cpEmail);

        Company company=companyMapper.findByParam1(cpPhone,cpEmail);
        int count=userCompanyMapper.add(userId,company.getId());

        return  count;
    }
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addCompany2(String cpName, int id) {
        return companyMapper.addCompany2(cpName,id);
    }

    @Override
    public Company findByParam1(String cpPhone, String cpEmail) {
        return companyMapper.findByParam1(cpPhone,cpEmail);
    }

    @Override
    public Company findByParam2(int id) {
        return companyMapper.findByParam2(id);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addindex1(Company company) {
        return companyMapper.addindex1(company);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addtag(String cpTig, int id) {
        return companyMapper.addtag(cpTig,id);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addcrteam(Map<String ,Object>map) {
        return companyMapper.addcrteam(map);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addproduct(Map<String ,Object> map) {
        return companyMapper.addproduct(map);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addtag2(String cpLongInfo, int cpid) {
        return companyMapper.addtag2(cpLongInfo,cpid);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addindex2(String cpLicense, int id) {
        return companyMapper.addindex2(cpLicense,id);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addtag3(int cpId,String cpLongInfo) {
        return companyMapper.addtag3(cpId,cpLongInfo);
    }

    @Override
    public Company findAll(int cpId) {
        return companyMapper.findAll(cpId);
    }

    @Override
    public Company check(int userId) {
        return companyMapper.check(userId);
    }

    @Override
    public int findcpId(int userId) {
        return companyMapper.findcpId(userId);
    }

    @Override
    public Company findOneConpany(int cpId) {
        return companyMapper.findOneConpany(cpId);
    }

    @Override
    public int updatelicense(String cpLicense, int cpId) {
        return companyMapper.updatelicense(cpLicense,cpId);
    }
}
