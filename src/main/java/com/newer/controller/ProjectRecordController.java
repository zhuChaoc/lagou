package com.newer.controller;

import com.newer.domain.ProjectRecord;
import com.newer.service.ProjectRecordService;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/record")
public class ProjectRecordController {
    @Autowired
    private ProjectRecordService projectRecordService;

    @RequestMapping("/insert")
    public Map<String,Object> insertProjectRecord(int reid,String wname,String wjob,String beginYear,
                      String beginMonth,  String endYear,String endMonth,String describe){
        ProjectRecord projectRecord=new ProjectRecord();
        projectRecord.setReid(reid);
        projectRecord.setWname(wname);
        projectRecord.setWjob(wjob);
        projectRecord.setBeginYear(beginYear);
        projectRecord.setBeginMonth(beginMonth);
        projectRecord.setEndYear(endYear);
        projectRecord.setEndMonth(endMonth);
        projectRecord.setXmdescribe(describe);
        int result=projectRecordService.addProjectRecord(projectRecord);
        List<ProjectRecord> list=projectRecordService.selectProjectRecord(reid);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }
    @RequestMapping("/select")
    public Map<String,Object> selectProjectRecord(int reid){
        List<ProjectRecord> list=projectRecordService.selectProjectRecord(reid);
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        return map;
    }
}
