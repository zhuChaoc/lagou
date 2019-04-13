package com.newer.controller;

import com.newer.domain.*;
import com.newer.service.CompanyService;
import com.newer.util.SecurityCode;
import com.newer.util.SendmailUtil;
import org.apache.commons.lang.StringUtils;
import org.omg.CORBA.MARSHAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.*;


@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/bind1")
    public Map bind1(@RequestParam("cpPhone") String cpPhone, @RequestParam("cpEmail") String cpEmail,
                      HttpSession session) {
        AuthUser authUser = (AuthUser) session.getAttribute("loginer");
        User user=authUser.getUser();
        Map<String ,Object>map=new HashMap<>();


        int count=companyService.addCompany1(cpPhone, cpEmail, user.getId());
        if (count>0){
            map.put("msg","suc");

            Company company = companyService.findByParam1(cpPhone, cpEmail);
            session.setAttribute("company", company);
        }else{
            map.put("msg","error");
        }
        return map;

    }

    @PostMapping("/bind2")
    public Map bind2(@RequestParam("cpName") String cpName, HttpSession session) throws Exception {
        Map<String ,Object> map=new HashMap<>();
        AuthUser authUser = (AuthUser) session.getAttribute("loginer");
        User user=authUser.getUser();//登录者信息
        Company company = (Company) session.getAttribute("company");//公司信息
        int count = companyService.addCompany2(cpName, company.getId());//添加公司名
        if (count>0) {
            company = companyService.findByParam2(company.getId());//公司信息
            session.setAttribute("company", company);//新的公司信息

            String cpEmail = company.getCpEmail();
            String emailTitle = "这是一封测试邮件";
            String code = SecurityCode.getSecurityCode();
            String emailContent = "您的验证码是" + code;
            SendmailUtil.sendEmail(cpEmail, emailTitle, emailContent);
            session.setAttribute("code", code);
            map.put("cpEmail",cpEmail);
            map.put("cpName",cpName);
            map.put("msg","suc");
        }else{
            map.put("msg","error");
        }
        return  map;
    }

    @PostMapping("/bind3")
    public Map bind3(@RequestParam("code") String code, HttpSession session) throws Exception {
        Map<String ,Object> map=new HashMap<>();
        String realcode = (String) session.getAttribute("code");
        if (realcode.equals(code)) {
            map.put("msg","suc");
            session.removeAttribute("code");
        } else {
            map.put("msg","error");
            Company company= (Company) session.getAttribute("company");
            String cpEmail = company.getCpEmail();
            String emailTitle = "这是一封测试邮件";
            String code1 = SecurityCode.getSecurityCode();
            String emailContent = "您的验证码是" + code1;
            SendmailUtil.sendEmail(cpEmail, emailTitle, emailContent);
            session.setAttribute("code", code1);
        }

        return  map;
    }

    /**
     * 添加公司基本信息
     * @param cpShort
     * @param cpUrl
     * @param cpCity
     * @param cpArea
     * @param cpSize
     * @param cpDevelop
     * @param cpInvestor
     * @param cpShortInfo
     * @param multipartFiles
     * @param session
     */
    @ResponseBody
    @PostMapping(value = "/index1", produces = "application/json;charset=UTF-8")
    public Map index1(@RequestParam("cpShort") String cpShort, @RequestParam("cpUrl") String cpUrl,
                       @RequestParam("cpCity") String cpCity, @RequestParam("cpArea") String cpArea,
                       @RequestParam("cpSize") String cpSize, @RequestParam("cpDevelop") String cpDevelop,
                       @RequestParam("cpInvestor") String cpInvestor, @RequestParam("cpShortInfo") String cpShortInfo,
                       @RequestParam("file") MultipartFile[] multipartFiles, HttpSession session) {
        Map<String ,Object> map=new HashMap<>();
        Company company = (Company) session.getAttribute("company");
        company.setCpShort(cpShort);
        company.setCpUrl(cpUrl);
        company.setCpCity(cpCity);
        company.setCpArea(cpArea);
        company.setCpSize(cpSize);
        company.setCpDevelop(cpDevelop);
        company.setCpInvestor(cpInvestor);
        company.setCpShortInfo(cpShortInfo);

        String cpLogo = "";
        String path = session.getServletContext().getRealPath("images");
        try {
            for (MultipartFile multipartFile : multipartFiles) {
                cpLogo=multipartFile.getOriginalFilename();
                File file=new File(path,cpLogo);
                multipartFile.transferTo(file);
                company.setCpLogo(cpLogo);
                int count=companyService.addindex1(company);
                if (count>0){
                    map.put("msg","suc");
                }else{
                    map.put("msg","error");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return map;
    }

    /**
     * 添加公司标签
     * @param labels
     * @param session
     */
    @RequestMapping("/tag")
    public Map addtag(@RequestParam("labels")String labels,HttpSession session){
        Map<String ,Object> map=new HashMap<>();
        Company company= (Company) session.getAttribute("company");
        System.out.println("测试1");
        int count=companyService.addtag(labels,company.getId());
        if (count>0){
            CpInfo cpInfo=new CpInfo();
            cpInfo.setCpTig(labels);
            company.setCpInfo(cpInfo);
            session.setAttribute("company",company);
            map.put("msg","suc");
        }else{
            map.put("msg","error");
        }
        return map;
    }

    /**
     * 添加公司创始人
     * @param createName
     * @param job
     * @param ownUrl
     * @param ownInfo
     * @param multipartFiles
     * @param session
     */
    @PostMapping(value = "/founder", produces = "application/json;charset=UTF-8")
    public Map index1(@RequestParam("createName") String createName, @RequestParam("job") String job,
                       @RequestParam("ownUrl") String ownUrl, @RequestParam("ownInfo") String ownInfo,
                       @RequestParam("file") MultipartFile[] multipartFiles, HttpSession session) {
        Map<String,Object>map=new HashMap<>();
        Company company = (Company) session.getAttribute("company");
        CrTeam crTeam=new CrTeam();
        crTeam.setCreateName(createName);
        crTeam.setJob(job);
        crTeam.setOwnUrl(ownUrl);
        crTeam.setOwnInfo(ownInfo);

        String ownPhoto = "";
        String path = session.getServletContext().getRealPath("images");
        try {
            for (MultipartFile multipartFile : multipartFiles) {
                ownPhoto = multipartFile.getOriginalFilename();
                File file=new File(path,ownPhoto);
                multipartFile.transferTo(file);
                crTeam.setOwnPhoto(ownPhoto);
                Map<String,Object>map1=new HashMap<>();
                map1.put("createName",createName);
                map1.put("job",job);
                map1.put("ownUrl",ownUrl);
                map1.put("ownInfo",ownInfo);
                map1.put("ownPhoto",ownPhoto);
                map1.put("cpId",company.getId());
                int count=companyService.addcrteam(map1);
                if (count>0) {
                    List<CrTeam> list = new ArrayList<>();
                    list.add(crTeam);
                    company.setCrTeams(list);
                    session.setAttribute("company",company);
                    map.put("msg","suc");
                }else{
                    map.put("msg","error");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    @PostMapping(value = "/index2", produces = "application/json;charset=UTF-8")
    public Map index2(@RequestParam("productName") String productName, @RequestParam("productUrl") String productUrl,
                       @RequestParam("productInfo") String productInfo,
                       @RequestParam("file") MultipartFile[] multipartFiles, HttpSession session) {
        Map<String ,Object> map=new HashMap<>();
        Company company = (Company) session.getAttribute("company");
        CpProduct cpProduct=new CpProduct();
        cpProduct.setProductName(productName);
        cpProduct.setProductUrl(productUrl);
        cpProduct.setProductInfo(productInfo);

        String productPhoto = "";
        String path = session.getServletContext().getRealPath("images");
        try {
            for (MultipartFile multipartFile : multipartFiles) {
                productPhoto =multipartFile.getOriginalFilename();
                File file=new File(path,productPhoto);
                multipartFile.transferTo(file);
                cpProduct.setProductPhoto(productPhoto);
                Map<String,Object>map1=new HashMap<>();
                map1.put("productName",productName);
                map1.put("productUrl",productUrl);
                map1.put("productInfo",productInfo);
                map1.put("productPhoto",productPhoto);
                map1.put("cpId",company.getId());
                int count=companyService.addproduct(map1);
                if (count>0) {
                    List<CpProduct> list = new ArrayList<>();
                    list.add(cpProduct);
                    company.setCpProducts(list);
                    session.setAttribute("company", company);
                    map.put("msg","suc");
                }else{
                    map.put("msg","error");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 添加公司介绍
     * @param cpLongInfo
     * @param session
     */
    @PostMapping("/index3")
    public Map index3(@RequestParam("cpLongInfo")String cpLongInfo,HttpSession session){
        Map<String,Object>map=new HashMap<>();
        Company company= (Company) session.getAttribute("company");
        int count=0;
        if (company.getCpInfo()!=null&&"".equals(company.getCpInfo())) {
            count =companyService.addtag2(cpLongInfo, company.getId());
        }else{
            count=companyService.addtag3(company.getId(),cpLongInfo);
        }
        if (count>0) {
            CpInfo cpInfo = new CpInfo();
            cpInfo.setCpLongInfo(cpLongInfo);
            company.setCpInfo(cpInfo);
            session.setAttribute("company", company);
            map.put("msg","suc");
        }else{
            map.put("msg","error");
        }
        return map;
    }

    @PostMapping(value = "/auth", produces = "application/json;charset=UTF-8")
    public Map<String,Object> auth(@RequestParam("file") MultipartFile[] multipartFiles, HttpSession session) {
        Map<String,Object>map=new HashMap<>();
        Company company = (Company) session.getAttribute("company");

        String cpLicense = "";
        String path = session.getServletContext().getRealPath("images");
        try {
            for (MultipartFile multipartFile : multipartFiles) {
                cpLicense =multipartFile.getOriginalFilename();
                File file=new File(path,cpLicense);
                multipartFile.transferTo(file);
                int count=companyService.updatelicense(cpLicense,company.getId());
                if (count>0){
                    company.setCpLicense(cpLicense);
                    session.setAttribute("company",company);
                    map.put("msg",true);
                }else{
                    map.put("msg",false);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return  map;
    }

    @GetMapping("findAll")
    public Map findAll(HttpSession session){
        Map<String ,Object>map=new HashMap<>();
        Company company1= (Company) session.getAttribute("company");
        Company company= companyService.findAll(company1.getId());
        System.out.println(company);
        map.put("company",company);
        return map;
    }

    @GetMapping("/inits")
    public  Map<String,Object> inits(HttpSession session){
        Map<String ,Object>map=new HashMap<>();
        session.invalidate();
        map.put("msg",true);
        return map;
    }
}
