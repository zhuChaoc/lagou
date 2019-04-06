package com.newer.controller;
import com.newer.domain.Job;
import com.newer.service.CompanyService;
import com.newer.service.JobService;
import com.newer.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/job")
public class JobController {
    @Autowired
    private JobService jobService;
    @Autowired
    private CompanyService companyService;
    @RequestMapping("/select")
    public Map<String,Object> insertJobSeeker(String jobType,String jobName){
        jobType="%"+jobType+"%";
        jobName="%"+jobName+"%";
        List<Job> jobs=jobService.selectJobs(jobType,jobName);
        Map<String,Object> map=new HashMap<>();
        map.put("jobs",jobs);
        return map;
    }
}
