package com.newer.controller;

import com.newer.domain.AuthUser;
import com.newer.domain.Company;
import com.newer.domain.User;

import com.newer.service.CompanyService;
import com.newer.service.UserService;
import com.newer.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author：ningbo
 * @Date:2019/4/3
 * @Description:com.newer.controller
 * @Version:1.0
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private CompanyService companyService;
    @RequestMapping("/findByEmail")
    public boolean findByEmail(@RequestParam("email") String email){
        User user=userService.findByEmail(email);
        if(user!=null){
            return false;//有这个用户，返回false
        }
        return true;
    }

    @RequestMapping("/register")
    public Map<String,Object> register(User user, HttpSession session){
        Map<String,Object> result=new HashMap<>();
        String password1 = MD5.getInstance().getMD5ofStr(user.getPassword());
        user.setPassword(password1);
        AuthUser authUser=userService.register(user);
        if(authUser!=null){
            result.put("success",true);
            session.setAttribute("loginer",authUser);

        }else {
            result.put("msg","注册失败，请重新注册！");
        }
        return result;
    }

    @RequestMapping("/updateUser")
    public Map<String,Object> updateUser(User user,HttpSession session){
        Map<String,Object> result=new HashMap<>();
        System.out.println(user);
        AuthUser authUser= (AuthUser) session.getAttribute("loginer");
        user.setId(authUser.getUser().getId());
        if(userService.updateUser(user)>0){
            result.put("success",true);
            authUser.getUser().setUserName(user.getUserName());
            authUser.getUser().setJob(user.getJob());

        }else {
            result.put("msg","保存失败！");
        }
        return result;
    }

    @RequestMapping("/getUserInfo")
    public AuthUser getUserInfo(HttpSession session){
        AuthUser authUser= (AuthUser) session.getAttribute("loginer");
        return authUser;
    }

    @RequestMapping("/login")
    public Map<String,Object> login(@RequestParam("email") String email,@RequestParam("password") String password,HttpSession session) throws Exception {
        Map<String,Object> result=new HashMap<>();
        String password2 = MD5.getInstance().getMD5ofStr(password);
        AuthUser authUser = userService.login(email,password2);

        if(authUser!=null){
            result.put("success",true);
            int cpId=companyService.findcpId(authUser.getUser().getId());
            Company company=companyService.findAll(cpId);
            session.setAttribute("company",company);
            session.setAttribute("loginer",authUser);
            result.put("cpEmail",company.getCpEmail());
        }else {
            result.put("msg","用户名或者密码不对！");
        }
        return result;
    }



}
