package com.newer.controller;

import com.newer.domain.JobSeeker;
import com.newer.service.JobSeekerService;
import com.newer.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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
    @RequestMapping("check")
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

}
