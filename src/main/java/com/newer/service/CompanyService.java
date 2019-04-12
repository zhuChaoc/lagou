package com.newer.service;

import com.newer.domain.Company;
import com.newer.domain.CpProduct;
import com.newer.domain.CrTeam;

import java.util.Map;

public interface CompanyService {
    int addCompany1(String cpPhone,String cpEmail,int userId);
    int addCompany2(String cpName,int id);

    Company findByParam1(String cpPhone,String cpEmail);
    Company findByParam2(int id);

    int addindex1(Company company);

    int  addtag(String cpTig,int id);

    int addcrteam(Map<String ,Object> map);

    int addproduct(Map<String,Object>map);

    int addtag2(String cpLongInfo,int cpid);

    int addindex2(String cpLicense,int id);

    int addtag3(int cpId,String cpLongInfo);

    Company findAll(int cpId);

    Company check(int userId);

    int findcpId(int userId);
}
