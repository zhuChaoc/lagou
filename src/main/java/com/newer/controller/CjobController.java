package com.newer.controller;

import com.newer.domain.Cjob;
import com.newer.domain.Job;
import com.newer.domain.JobSeeker;
import com.newer.service.CjobService;
import com.newer.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cjob")
public class CjobController {
    @Autowired
    private CjobService cjobService;
    @Autowired
    private JobService jobService;
    @RequestMapping("/insert")
    public Map<String,Object> insertCjob(Integer jid,HttpSession session){
        JobSeeker jobSeeker= (JobSeeker) session.getAttribute("jobSeeker");
        Map<String,Object> map=new HashMap<>();
        Integer jsid=jobSeeker.getJID();
        Integer result=cjobService.insertCjob(jsid,jid);
        map.put("result",result);
        return map;
    }
    @RequestMapping("/select")
    public Map<String,Object> selectCjob(HttpSession session){
        JobSeeker jobSeeker= (JobSeeker) session.getAttribute("jobSeeker");
        Map<String,Object> map=new HashMap<>();
        Integer jsid=jobSeeker.getJID();
        List<Cjob> cjobs=cjobService.selectCjob(jsid);
        List<Job> jobs=new ArrayList<>();
        cjobs.forEach(cjob -> {
            Job job=jobService.findById(cjob.getJid());
            jobs.add(job);
        });
        map.put("jobs",jobs);
        return map;
    }
    @RequestMapping("/delete")
    public Map<String,Object> deleteCjob(Integer jid,HttpSession session){
        JobSeeker jobSeeker= (JobSeeker) session.getAttribute("jobSeeker");
        Map<String,Object> map=new HashMap<>();
        Integer jsid=jobSeeker.getJID();
        Integer result=cjobService.deleteCjob(jsid,jid);
        map.put("result",result);
        return map;
    }
}
