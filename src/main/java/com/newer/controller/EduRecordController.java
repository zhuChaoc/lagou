package com.newer.controller;

import com.newer.domain.EduRecord;
import com.newer.service.EduRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/EduRecord")
public class EduRecordController  {
    @Autowired
    private EduRecordService eduRecordService;

    @RequestMapping("/updateEdu")
    public Map<String,Object> updateMyDescribe(EduRecord eduRecord){
        Map<String,Object> map=new HashMap<>();
        int result=eduRecordService.updateEduRecord(eduRecord);
        map.put("result",result);
        return map;
    }

}
