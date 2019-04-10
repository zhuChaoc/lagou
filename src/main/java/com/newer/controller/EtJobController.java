package com.newer.controller;

import com.newer.domain.EtJob;
import com.newer.service.EtJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController()
@RequestMapping("/etJob")
public class EtJobController {
    @Autowired
    private EtJobService etJobService;

    @RequestMapping("/select")
    public Map<String,Object> selectEtJob(int reid){
        List<EtJob> etJobs=etJobService.selectEtJob(reid);
        Map<String,Object> map=new HashMap<>();
        map.put("etjobs",etJobs);
        return map;
    }
     @RequestMapping("/add")
    public Map<String,Object> addEtJob(EtJob etJob){
      int result=etJobService.addEtJob(etJob);
      Map<String,Object> map=new HashMap<>();
      map.put("result",result);
      return  map;
    }
}
