package com.newer.test;

import com.newer.domain.JobSeeker;
import com.newer.util.SendmailUtil;
import org.junit.Test;

public class test1 {
    @Test
    public void test(){
        JobSeeker jobSeeker=new JobSeeker();
        jobSeeker.setJID(111);
        System.out.println(jobSeeker.getJID());
        System.out.println("测试");
    }
    @Test
    public void test2(){
        String tomailaddress="714229650@qq.com";
        String title="111";
        String msg="这是一封测试邮件";
        try {
            SendmailUtil.sendEmail(tomailaddress,title,msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
