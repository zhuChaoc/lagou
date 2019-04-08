package com.newer.controller;

import com.newer.domain.ProjectRecord;
import com.newer.service.ProjectRecordService;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/record")
public class ProjectRecordController {
    @Autowired
    private ProjectRecordService projectRecordService;

    @RequestMapping("/insert")
    public Map<String,Object> insertProjectRecord(int reid,String wname,String wjob,String beginYear,
                      String beginMonth,  String endYear,String endMonth,String describle){
        System.out.println("进入方法");
        ProjectRecord projectRecord=new ProjectRecord();
        projectRecord.setReid(reid);
        projectRecord.setWname(wname);
        projectRecord.setWjob(wjob);
        projectRecord.setBeginYear(beginYear);
         projectRecord.setBeginMonth(beginMonth);
         projectRecord.setEndYear(endYear);
         projectRecord.setEndMonth(endMonth);
         projectRecord.setDescribe(describle);
        int result=projectRecordService.addProjectRecord(projectRecord);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }
}
