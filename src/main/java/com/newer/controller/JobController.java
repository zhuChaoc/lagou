package com.newer.controller;

import com.newer.domain.Company;
import com.newer.domain.FirstJobTypeGroup;
import com.newer.domain.Job;
import com.newer.service.JobService;
import com.newer.service.JobTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author：ningbo
 * @Date:2019/4/9
 * @Description:com.newer.controller
 * @Version:1.0
 */
@RestController
@RequestMapping("jobs")
public class JobController {
    @Autowired
    private JobService jobService;

    @RequestMapping("addJob")
    public Map<String,Object> addJob(@RequestParam("positionType")String jobType, @RequestParam("positionName")String jobName,
                                     @RequestParam("jobNature")String jobQuality, @RequestParam("salaryMin")int minSal,
                                     @RequestParam("salaryMax")int maxSal, @RequestParam("department")String dname,
                                     @RequestParam("workAddress") String jobCity, @RequestParam("workYear")String jobExperience,
                                     @RequestParam("education")String jobEducation, @RequestParam("positionAdvantage")String jobLightPoint,
                                     @RequestParam("positionDetail")String jobInfo, @RequestParam("positionAddress")String jobAddress,
                                     HttpSession session){
        Map<String,Object> result=new HashMap<>();

        Company company= (Company) session.getAttribute("company");
        Job job=new Job(company.getId(),jobType,jobName,dname,jobQuality,minSal,maxSal,jobCity,jobExperience,jobEducation,jobLightPoint,jobInfo,jobAddress);
        System.out.println(job);
        if(jobService.addJob(job)>0){
            result.put("success",true);
            result.put("content","positions.html");
        }else {
            result.put("msg","发布新职位失败！");
        }
        return  result;
    }

    @RequestMapping("/checkcity")
    public Map<String,Object>checkcity(@RequestParam("city")String city){
        Map<String,Object>map=new HashMap<>();

        int count=jobService.checkcity(city);
        if (count==1){
            map.put("success",true);
        }else{
            map.put("success",false);
        }
        return map;
    }

    @RequestMapping("/findAll")
    public Map<String,Object>findAll(HttpSession session){
        Map<String,Object>map=new HashMap<>();
        Company company= (Company) session.getAttribute("company");
        List<Job>list=jobService.findAll(company.getId());
        if (list!=null){
            map.put("jobs",list);
            map.put("msg",true);
        }else{
            map.put("msg",false);
        }

        return map;
    }

    @RequestMapping("/updatestate")
    public Map<String,Object>updatestate(@RequestParam("id")int id,HttpSession session){
        Map<String,Object>map=new HashMap<>();
        Company company= (Company) session.getAttribute("company");
        int count=jobService.updatestate(id,company.getId());
        if (count>0){
            map.put("msg",true);
        }else{
            map.put("msg",false);
        }

        return map;
    }

    @RequestMapping("/deletejob")
    public Map<String,Object>deletejob(@RequestParam("id")int id){
        Map<String,Object>map=new HashMap<>();

        int count=jobService.deletejob(id);
        if (count>0){
            map.put("msg",true);
        }else{
            map.put("msg",false);
        }

        return map;
    }

}
