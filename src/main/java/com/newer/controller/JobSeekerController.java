package com.newer.controller;

import com.newer.domain.Job;
import com.newer.domain.JobSeeker;
import com.newer.service.JobSeekerService;
import com.newer.util.MD5;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/seeker")
public class JobSeekerController {
    @Autowired
    private JobSeekerService jobSeekerService;

    @RequestMapping("/register")
    public Map<String,Object> insertJobSeeker(String EMAIL,String PWD){
        JobSeeker jobSeeker=new JobSeeker();
        jobSeeker.setEMAIL(EMAIL);
        jobSeeker.setPWD(MD5.getInstance().getMD5ofStr(PWD));
        int result=jobSeekerService.insertJobSeeker(jobSeeker);
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }
    @RequestMapping("/check")
    public Map<String,Object> selectEMAIL(String  EMAIL){
        JobSeeker jobSeeker=new JobSeeker();
        jobSeeker.setEMAIL(EMAIL);
        int count=jobSeekerService.selectEamil(EMAIL);
        String result="";
        if (count>0){
            result="该邮箱已被使用";
        }else {
            result="该邮箱可以使用";
        }
        Map<String,Object> map=new HashMap<>();
        map.put("result",result);
        return map;
    }

    @RequestMapping("/login")
    public Map<String,Object> selectjobSeeker(String email, String password, HttpSession session){
        password=MD5.getInstance().getMD5ofStr(password);
        JobSeeker jobSeeker=jobSeekerService.selectJobSeeker(email, password);
        Map<String,Object> map=new HashMap<>();
        if (jobSeeker!=null){
            session.setAttribute("jobSeeker",jobSeeker);
            map.put("success",true);
        }else {
            map.put("success",false);
            map.put("msg","用户名或密码错误");
        }
        return map;
    }
    @RequestMapping("/getUser")
    public Map<String,Object> getUser(HttpSession session){
        JobSeeker jobSeeker= (JobSeeker) session.getAttribute("jobSeeker");
        Map<String,Object> map=new HashMap<>();
        map.put("jobSeeker",jobSeeker);
        return map;
    }
    @RequestMapping("/update")
    public Map<String,Object> getUser(JobSeeker jobSeeker,HttpSession session){
        Map<String,Object> map=new HashMap<>();
        String email=((JobSeeker) session.getAttribute("jobSeeker")).getEMAIL();
        String pwd=((JobSeeker) session.getAttribute("jobSeeker")).getPWD();
        Integer JID=((JobSeeker) session.getAttribute("jobSeeker")).getJID();
        jobSeeker.setJID(JID);
        if (jobSeekerService.updateJobSeeker(jobSeeker)>0){
            jobSeeker=jobSeekerService.selectJobSeeker(email,pwd);
            session.setAttribute("jobSeeker",jobSeeker);
            map.put("jobSeeker",jobSeeker);
            map.put("suc",true);
        }else {
            map.put("jobSeeker",jobSeeker);
            map.put("suc",false);
        }
        return map;
    }
    @RequestMapping("/image")
    public Map<String,Object> changeImg(MultipartFile pic, HttpServletRequest request, HttpServletResponse response,HttpSession session) throws IOException {
        JobSeeker jobSeeker= (JobSeeker) session.getAttribute("jobSeeker");
        Map<String,Object> map=new HashMap<>();
        // 获取图片原始文件名
        String originalFilename = pic.getOriginalFilename();
        // 文件名使用当前时间
        String name = ""+jobSeeker.getJID();
        // 获取上传图片的扩展名(jpg/png/...)
        String extension = FilenameUtils.getExtension(originalFilename);
        // 图片上传的相对路径（因为相对路径放到页面上就可以显示图片）
        String path = "/images/" + name + "." + extension;
        String SEEKER_PIC=name + "." + extension;
        // 图片上传的绝对路径
        String url = request.getSession().getServletContext().getRealPath("") + path;
        File dir = new File(url);
        if(!dir.exists()) {
            dir.mkdirs();
        }
        // 上传图片
        pic.transferTo(new File(url));
        jobSeeker.setSEEKER_PIC(SEEKER_PIC);
        jobSeekerService.updatePic(jobSeeker);
        session.setAttribute("jobSeeker",jobSeeker);
        map.put("path",SEEKER_PIC);
        return map;
    }
}
