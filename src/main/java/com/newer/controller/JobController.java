package com.newer.controller;
import com.newer.domain.Job;
import com.newer.service.CompanyService;
import com.newer.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public Map<String,Object> selectJobs(String jobType,String jobName,String cpName){
        jobType="%"+jobType+"%";
        jobName="%"+jobName+"%";
        cpName="%"+cpName+"%";
        List<Job> jobs=jobService.selectJobs(jobType,jobName,cpName);
        Map<String,Object> map=new HashMap<>();
        map.put("jobs",jobs);
        return map;
    }
    @RequestMapping("/selectNew")
    public Map<String,Object> selectNewJobs(){
        List<Job> jobs=jobService.selectNewJobs();
        Map<String,Object> map=new HashMap<>();
        map.put("jobs",jobs);
        return map;
    }
 @RequestMapping("/findInfo")
    public Job findById(Integer id){
     return jobService.findById(id);
 }
}
