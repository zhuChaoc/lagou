package com.newer.test;

import com.newer.domain.Job;
import com.newer.service.JobService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test1 {
    @Test
    public void test(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //从bean容器获取指定的bean实例
        JobService jobService =ctx.getBean("jobServiceImpl", JobService.class);
        List<Job> jobs=jobService.selectJobs("%%","%java%");
        jobs.forEach(job -> {
            System.out.println(job.getJobInfo());
        });
    }
}
