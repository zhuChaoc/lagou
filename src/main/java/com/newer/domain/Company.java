package com.newer.domain;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 公司基本信息类
 */
public class Company implements Serializable {

    private Integer id;  //公司id
    private String cpName; //公司名称
    private String cpPhone;//公司联系方式
    private String cpEmail;//公司邮箱
    private String cpShort;//公司简称
    private String cpLogo;//公司logo
    private String cpLicense;//营业执照
    private String cpUrl;//公司网址
    private String cpCity;//所在城市
    private String cpArea;//行业领域
    private String cpSize;//公司规模
    private String cpDevelop;//发展规模
    private String cpInvestor;//投资机构
    private String cpShortInfo;//公司简介
    private CpInfo cpInfo;//公司背景
    private List<CrTeam> crTeams;//创始团队
    private List<CpProduct>cpProducts;//公司产品
    private List<Job>jobs;//发布职位

    public Company() {
    }

    public Company(Integer id, String cpName, String cpPhone, String cpEmail, String cpShort, String cpLogo, String cpLicense, String cpUrl, String cpCity, String cpArea, String cpSize, String cpDevelop, String cpInvestor, String cpShortInfo, CpInfo cpInfo, List<CrTeam> crTeams, List<CpProduct> cpProducts, List<Job> jobs) {
        this.id = id;
        this.cpName = cpName;
        this.cpPhone = cpPhone;
        this.cpEmail = cpEmail;
        this.cpShort = cpShort;
        this.cpLogo = cpLogo;
        this.cpLicense = cpLicense;
        this.cpUrl = cpUrl;
        this.cpCity = cpCity;
        this.cpArea = cpArea;
        this.cpSize = cpSize;
        this.cpDevelop = cpDevelop;
        this.cpInvestor = cpInvestor;
        this.cpShortInfo = cpShortInfo;
        this.cpInfo = cpInfo;
        this.crTeams = crTeams;
        this.cpProducts = cpProducts;
        this.jobs = jobs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getCpPhone() {
        return cpPhone;
    }

    public void setCpPhone(String cpPhone) {
        this.cpPhone = cpPhone;
    }

    public String getCpEmail() {
        return cpEmail;
    }

    public void setCpEmail(String cpEmail) {
        this.cpEmail = cpEmail;
    }

    public String getCpShort() {
        return cpShort;
    }

    public void setCpShort(String cpShort) {
        this.cpShort = cpShort;
    }

    public String getCpLogo() {
        return cpLogo;
    }

    public void setCpLogo(String cpLogo) {
        this.cpLogo = cpLogo;
    }

    public String getCpLicense() {
        return cpLicense;
    }

    public void setCpLicense(String cpLicense) {
        this.cpLicense = cpLicense;
    }

    public String getCpUrl() {
        return cpUrl;
    }

    public void setCpUrl(String cpUrl) {
        this.cpUrl = cpUrl;
    }

    public String getCpCity() {
        return cpCity;
    }

    public void setCpCity(String cpCity) {
        this.cpCity = cpCity;
    }

    public String getCpArea() {
        return cpArea;
    }

    public void setCpArea(String cpArea) {
        this.cpArea = cpArea;
    }

    public String getCpSize() {
        return cpSize;
    }

    public void setCpSize(String cpSize) {
        this.cpSize = cpSize;
    }

    public String getCpDevelop() {
        return cpDevelop;
    }

    public void setCpDevelop(String cpDevelop) {
        this.cpDevelop = cpDevelop;
    }

    public String getCpInvestor() {
        return cpInvestor;
    }

    public void setCpInvestor(String cpInvestor) {
        this.cpInvestor = cpInvestor;
    }

    public String getCpShortInfo() {
        return cpShortInfo;
    }

    public void setCpShortInfo(String cpShortInfo) {
        this.cpShortInfo = cpShortInfo;
    }

    public CpInfo getCpInfo() {
        return cpInfo;
    }

    public void setCpInfo(CpInfo cpInfo) {
        this.cpInfo = cpInfo;
    }

    public List<CrTeam> getCrTeams() {
        return crTeams;
    }

    public void setCrTeams(List<CrTeam> crTeams) {
        this.crTeams = crTeams;
    }

    public List<CpProduct> getCpProducts() {
        return cpProducts;
    }

    public void setCpProducts(List<CpProduct> cpProducts) {
        this.cpProducts = cpProducts;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
