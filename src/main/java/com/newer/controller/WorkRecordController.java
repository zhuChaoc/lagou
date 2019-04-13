package com.newer.controller;

import com.newer.domain.WorkRecord;
import com.newer.service.WorkRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workRecord")
public class WorkRecordController {
    @Autowired
    private WorkRecordService workRecordService;
    @RequestMapping("/insert")
    public Map<String,Object> insertWorkRecord(WorkRecord workRecord){
        int result=workRecordService.addWorkRecord(workRecord);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }
    @RequestMapping("/select")
    public Map<String,Object> selectWorkRecord(int reid){
        List<WorkRecord> list=workRecordService.selectWorkRecord(reid);
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        return map;
    }
    @RequestMapping("/delete")
    public Map<String,Object> deleteWorkRecord(int wid){
        WorkRecord workRecord=new WorkRecord();
        workRecord.setWid(wid);
        int result=workRecordService.deleteWorkRecord(wid);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return  map;
    }
}
