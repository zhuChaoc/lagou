package com.newer.controller;

import com.newer.domain.Job;
import com.newer.domain.JobSeeker;
import com.newer.service.JobSeekerService;
import com.newer.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/seeker")
public class JobSeekerController {
    @Autowired
    private JobSeekerService jobSeekerService;

    @RequestMapping("/register")
    public Map<String,Object> insertJobSeeker(String EMAIL,String PWD){
        JobSeeker jobSeeker=new JobSeeker();
        jobSeeker.setEMAIL(EMAIL);
        jobSeeker.setPWD(MD5.getInstance().getMD5ofStr(PWD));
        int result=jobSeekerService.insertJobSeeker(jobSeeker);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }
    @RequestMapping("/check")
    public Map<String,Object> selectEMAIL(String  EMAIL){
        JobSeeker jobSeeker=new JobSeeker();
        jobSeeker.setEMAIL(EMAIL);
        int count=jobSeekerService.selectEamil(EMAIL);
        String result="";
        if (count>0){
            result="该邮箱已被使用";
        }else {
            result="该邮箱可以使用";
        }
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }

    @RequestMapping("/login")
    public Map<String,Object> selectjobSeeker(String email, String password, HttpSession session){
        password=MD5.getInstance().getMD5ofStr(password);
        JobSeeker jobSeeker=jobSeekerService.selectJobSeeker(email, password);
        Map<String,Object> map=new HashMap<>();
        if (jobSeeker!=null){
            session.setAttribute("jobSeeker",jobSeeker);
            map.put("success",true);
        }else {
            map.put("success",false);
            map.put("msg","用户名或密码错误");
        }
        return map;
    }
    @RequestMapping("/getUser")
    public Map<String,Object> getUser(HttpSession session){
        JobSeeker jobSeeker= (JobSeeker) session.getAttribute("jobSeeker");
        Map<String,Object> map=new HashMap<>();
        map.put("jobSeeker",jobSeeker);
        return map;
    }
}
