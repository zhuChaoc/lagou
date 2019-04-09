package com.newer.controller;

import com.newer.domain.*;
import com.newer.service.CompanyService;
import com.newer.util.SecurityCode;
import com.newer.util.SendmailUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/bind1")
    public void bind1(@RequestParam("cpPhone") String cpPhone, @RequestParam("cpEmail") String cpEmail,
                      HttpSession session) {
        //User user = (User) session.getAttribute("loginer");

        User user=new User();
        user.setUserName("jack");
        user.setEmail("1223638017@qq.com");
        user.setPassword("111111");
        user.setId(11);
        session.setAttribute("loginer",user);

        int count=companyService.addCompany1(cpPhone, cpEmail, user.getId());
        System.out.println(count);
        Company company = companyService.findByParam1(cpPhone, cpEmail);
        session.setAttribute("company", company);

    }

    @PostMapping("/bind2")
    public void bind2(@RequestParam("cpName") String cpName, HttpSession session) throws Exception {
        User user = (User) session.getAttribute("loginer");//登录者信息
        Company company = (Company) session.getAttribute("company");//公司信息
        int count = companyService.addCompany2(cpName, company.getId());//添加公司名
        company = companyService.findByParam2(company.getId());//公司信息
        session.setAttribute("company", company);//新的公司信息

        String cpEmail = company.getCpEmail();
        String emailTitle = "这是一封测试邮件";
        String code = SecurityCode.getSecurityCode();
        String emailContent = "您的验证码是" + code;
        SendmailUtil.sendEmail(cpEmail, emailTitle, emailContent);
        session.setAttribute("code", code);


    }

    @PostMapping("/bind3")
    public void bind3(@RequestParam("code") String code, HttpSession session) {
        String realcode = (String) session.getAttribute("code");
        if (realcode.equals(code)) {
            System.out.println("成功");

        } else {
            System.out.println("失败");
        }
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
    @RequestMapping(value = "/index1", produces = "application/json;charset=UTF-8")
    public void index1(@RequestParam("cpShort") String cpShort, @RequestParam("cpUrl") String cpUrl,
                       @RequestParam("cpCity") String cpCity, @RequestParam("cpArea") String cpArea,
                       @RequestParam("cpSize") String cpSize, @RequestParam("cpDevelop") String cpDevelop,
                       @RequestParam("cpInvestor") String cpInvestor, @RequestParam("cpShortInfo") String cpShortInfo,
                       @RequestParam("file") MultipartFile[] multipartFiles, HttpSession session) {
        System.out.println("测试1"+cpShort);
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
                companyService.addindex1(company);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 添加公司标签
     * @param cpTig
     * @param session
     */
    @PostMapping("/tag")
    public void addtag(@RequestParam("labels")String cpTig,HttpSession session){
        Company company= (Company) session.getAttribute("company");
        int count=companyService.addtag(cpTig,company.getId());
        if (count>0){
            CpInfo cpInfo=new CpInfo();
            cpInfo.setCpTig(cpTig);
            company.setCpInfo(cpInfo);
            session.setAttribute("company",company);
        }
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
    public void index1(@RequestParam("createName") String createName, @RequestParam("job") String job,
                       @RequestParam("ownUrl") String ownUrl, @RequestParam("ownInfo") String ownInfo,
                       @RequestParam("file") MultipartFile[] multipartFiles, HttpSession session) {

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
                String ext = StringUtils.substring(multipartFile.getOriginalFilename(), multipartFile.getOriginalFilename().lastIndexOf("."));
                ownPhoto = UUID.randomUUID().toString() + ext;
                File file=new File(path,ownPhoto);
                multipartFile.transferTo(file);
                crTeam.setOwnPhoto(ownPhoto);
                companyService.addcrteam(crTeam,company.getId());
                List<CrTeam>list=new ArrayList<>();
                list.add(crTeam);
                company.setCrTeams(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @PostMapping(value = "/index2", produces = "application/json;charset=UTF-8")
    public void index2(@RequestParam("productName") String productName, @RequestParam("productUrl") String productUrl,
                       @RequestParam("productInfo") String productInfo,
                       @RequestParam("file") MultipartFile[] multipartFiles, HttpSession session) {

        Company company = (Company) session.getAttribute("company");
        CpProduct cpProduct=new CpProduct();
        cpProduct.setProductName(productName);
        cpProduct.setProductUrl(productUrl);
        cpProduct.setProductInfo(productInfo);

        String productPhoto = "";
        String path = session.getServletContext().getRealPath("images");
        try {
            for (MultipartFile multipartFile : multipartFiles) {
                String ext = StringUtils.substring(multipartFile.getOriginalFilename(), multipartFile.getOriginalFilename().lastIndexOf("."));
                productPhoto = UUID.randomUUID().toString() + ext;
                File file=new File(path,productPhoto);
                multipartFile.transferTo(file);
                cpProduct.setProductPhoto(productPhoto);
                companyService.addproduct(cpProduct,company.getId());
                List<CpProduct>list=new ArrayList<>();
                list.add(cpProduct);
                session.setAttribute("company",company);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 添加公司介绍
     * @param cpLongInfo
     * @param session
     */
    @PostMapping("/index3")
    public void index3(@RequestParam("cpLongInfo")String cpLongInfo,HttpSession session){
        Company company= (Company) session.getAttribute("company");
        companyService.addtag2(cpLongInfo,company.getId());
        CpInfo cpInfo=new CpInfo();
        cpInfo.setCpTig(company.getCpInfo().getCpTig());
        cpInfo.setCpLongInfo(cpLongInfo);
        company.setCpInfo(cpInfo);
        session.setAttribute("company",company);
    }

    @PostMapping(value = "/auth", produces = "application/json;charset=UTF-8")
    public void auth(@RequestParam("file") MultipartFile[] multipartFiles, HttpSession session) {

        Company company = (Company) session.getAttribute("company");

        String cpLicense = "";
        String path = session.getServletContext().getRealPath("images");
        try {
            for (MultipartFile multipartFile : multipartFiles) {
                String ext = StringUtils.substring(multipartFile.getOriginalFilename(), multipartFile.getOriginalFilename().lastIndexOf("."));
                cpLicense = UUID.randomUUID().toString() + ext;
                File file=new File(path,cpLicense);
                multipartFile.transferTo(file);
                company.setCpLicense(cpLicense);
                session.setAttribute("company",company);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @GetMapping("findAll")
    public void findAll(HttpSession session, Map<String,Object> map){
        Company company= (Company) session.getAttribute("company");
        map.put("company",company);
    }

}
