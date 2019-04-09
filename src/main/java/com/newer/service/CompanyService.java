package com.newer.service;

import com.newer.domain.Company;
import com.newer.domain.CpProduct;
import com.newer.domain.CrTeam;

public interface CompanyService {
    int addCompany1(String cpPhone,String cpEmail,int userId);
    int addCompany2(String cpName,int id);

    Company findByParam1(String cpPhone,String cpEmail);
    Company findByParam2(int id);

    int addindex1(Company company);

    int  addtag(String cpTig,int id);

    int addcrteam(CrTeam crTeam,int cpId);

    int addproduct(CpProduct cpProduct,int cpId);

    int addtag2(String cpLongInfo,int cpid);

    int addindex2(String cpLicense,int id);

    Company findAll();
}
