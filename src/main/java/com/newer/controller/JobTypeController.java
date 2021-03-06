package com.newer.controller;

import com.newer.domain.Company;
import com.newer.domain.FirstJobTypeGroup;
import com.newer.domain.Job;
import com.newer.service.JobService;
import com.newer.service.JobTypeService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author：ningbo
 * @Date:2019/4/9
 * @Description:com.newer.controller
 * @Version:1.0
 */
@RestController
@RequestMapping("jobTypes")
public class JobTypeController {
    @Autowired
    private JobTypeService jobTypeService;

    @RequestMapping("getGroups")
    public Map<String,Object> getGroups( HttpSession session){
        Map<String,Object> result=new HashMap<>();

            List<FirstJobTypeGroup> firstJobTypeGroupList = jobTypeService.getFirstJobTypeGroups();
            if (firstJobTypeGroupList != null) {
                result.put("firstJobTypeGroupList", firstJobTypeGroupList);
                return result;
            }

        return  null;
    }
}
