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
    public int addcrteam(CrTeam crTeam, int cpId) {
        return companyMapper.addcrteam(crTeam,cpId);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int addproduct(CpProduct cpProduct, int cpId) {
        return companyMapper.addproduct(cpProduct,cpId);
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

    @Override
    public Company findAll() {
        return companyMapper.findAll();
    }
}
