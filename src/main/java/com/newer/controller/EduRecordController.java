package com.newer.controller;

import com.newer.domain.EduRecord;
import com.newer.domain.ProjectRecord;
import com.newer.service.EduRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
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

    @RequestMapping("/selectEdu")
    public Map<String,Object> selectEduRecord(Integer reid){
        List<EduRecord> list=eduRecordService.selectEduRecord(reid);
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        return map;
    }

    @RequestMapping("/addEdu")
    public Map<String,Object> addEduRecord(EduRecord eduRecord){
        int result=eduRecordService.insetEduRecord(eduRecord);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return  map;
    }

    @RequestMapping("/deleteEdu")
    public Map<String,Object> deleteEdu(int eid){
        int result=eduRecordService.deleteEduRecord(eid);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }


}
