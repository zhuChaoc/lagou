package com.newer.controller;

import com.newer.domain.JobSeeker;
import com.newer.domain.Resume;
import com.newer.service.JobSeekerService;
import com.newer.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/resume")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    @RequestMapping("/updatezwms")
    public Map<String,Object> updateMyDescribe(Resume resume){
        Map<String,Object> map=new HashMap<>();
        int result=resumeService.updateMyDescribe(resume);
        map.put("result",result);
        return map;
    }
    @RequestMapping("/select")
    public Map<String,Object> selectMyDescribe(Integer reid){
        Map<String,Object> map=new HashMap<>();
        Resume resume=resumeService.selectMyDescribe(reid);
        map.put("resume",resume);
        return map;
    }
    @RequestMapping("/updateRname")
    public Map<String,Object> updateRname(Resume resume){
        Map<String,Object> map=new HashMap<>();
        int result=resumeService.updateRname(resume);
        map.put("result",result);
        return map;
    }
    @RequestMapping("/selectRname")
    public Map<String,Object> selectRname(Integer reid){
        Map<String,Object> map=new HashMap<>();
        Resume resume=resumeService.selectRname(reid);
        map.put("resume",resume);
        return map;
    }
    @RequestMapping("/selectResume")
    public Map<String,Object> selectResume(HttpSession session){
        JobSeeker jobSeeker= (JobSeeker) session.getAttribute("jobSeeker");
        Map<String,Object> map=new HashMap<>();
        Integer jid=jobSeeker.getJID();
        Resume resume=resumeService.selectResume(jid);
        map.put("resume",resume);
        return map;
    }
}
