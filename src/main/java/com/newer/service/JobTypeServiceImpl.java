package com.newer.service;

import com.newer.domain.FirstJobTypeGroup;
import com.newer.domain.JobType;
import com.newer.domain.SecondJobTypeGroup;
import com.newer.mapper.JobTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：ningbo
 * @Date:2019/4/9
 * @Description:com.newer.service
 * @Version:1.0
 */
@Service
public class JobTypeServiceImpl implements JobTypeService {
    @Autowired
    private JobTypeMapper jobTypeMapper;

    @Override
    public List<FirstJobTypeGroup> getFirstJobTypeGroups() {
        List<FirstJobTypeGroup> firstJobTypeGroupList=new ArrayList<>();

        List<JobType> findFirstTypes = jobTypeMapper.findFirstType();
        for(JobType jt:findFirstTypes){
            FirstJobTypeGroup firstJobTypeGroup=new FirstJobTypeGroup();
            firstJobTypeGroup.setJobType(jt);
            List<SecondJobTypeGroup> secondJobTypeGroupList=new ArrayList<>();

            List<JobType> findSecondTypes = jobTypeMapper.findChildByParentId(jt.getId());
            for(JobType jt2:findSecondTypes){
                SecondJobTypeGroup secondJobTypeGroup=new SecondJobTypeGroup();
                secondJobTypeGroup.setJobType(jt2);
                secondJobTypeGroup.setJobTypes(jobTypeMapper.findChildByParentId(jt2.getId()));
                secondJobTypeGroupList.add(secondJobTypeGroup);
            }

            firstJobTypeGroup.setSecondJobTypes(secondJobTypeGroupList);
            firstJobTypeGroupList.add(firstJobTypeGroup);
        }
        return  firstJobTypeGroupList;
    }


}
