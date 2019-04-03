package com.newer.test;

import com.newer.domain.JobSeeker;
import org.junit.Test;

public class test1 {
    @Test
    public void test(){
        JobSeeker jobSeeker=new JobSeeker();
        jobSeeker.setJID(111);
        System.out.println(jobSeeker.getJID());
        System.out.println("测试");
    }
}
