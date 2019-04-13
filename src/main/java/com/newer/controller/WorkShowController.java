package com.newer.controller;
import com.newer.domain.WorkShow;
import com.newer.service.WorkShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workShow")
public class WorkShowController {
    @Autowired
    private WorkShowService workShowService;
    @RequestMapping("/insert")
    public Map<String,Object> insertWorkShow(WorkShow workShow){
        int result=workShowService.addWorkShow(workShow);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }
    @RequestMapping("/select")
    public Map<String,Object> selectProjectRecord(int reid){
        List<WorkShow> list=workShowService.selectWorkShow(reid);
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        return map;
    }
    @RequestMapping("/delete")
    public Map<String,Object> deleteWorkRecord(int wsid){
        WorkShow workShow=new WorkShow();
        workShow.setWsid(wsid);
        int result=workShowService.deleteWorkShow(wsid);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return  map;
    }
}
