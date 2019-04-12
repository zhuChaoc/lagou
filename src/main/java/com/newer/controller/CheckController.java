package com.newer.controller;

import com.newer.domain.AuthUser;
import com.newer.domain.Company;
import com.newer.domain.User;
import com.newer.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/check")
public class CheckController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("check1")
    public Map<String,Object> check1(HttpSession session) {
        Map<String,Object>map=new HashMap<>();
        AuthUser auser = (AuthUser) session.getAttribute("loginer");
        User user=auser.getUser();
        if (user != null) {
            Company company = companyService.check(user.getId());
            if (company.getCpPhone()!=null&&company.getCpEmail()!=null){
                if (company.getCpName()==null){
                    map.put("url","bindStep2.html");//无公司名称
                }else{
                    map.put("url","index01.html"); //有公司名称
                }
            }else{
                System.out.println("请继续");
            }
        }else{
            map.put("url","login.html");    //无登录用户信息
        }
        return map;
    }
    @GetMapping("check2")
    public Map<String,Object> check2(HttpSession session) {
        Map<String,Object>map=new HashMap<>();
        Company company= (Company) session.getAttribute("company");
        System.out.println(company);
        if (company.getCpShort()!= null) {
               map.put("url","myhome.html");  //公司主页
        }else{
            System.out.println("请继续");   //无公司用户信息
        }
        return map;
    }
}
