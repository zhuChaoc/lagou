package com.newer.domain;

import java.io.Serializable;

public class EduRecord implements Serializable {
    private int eid;
    private int reid;//简历表id
    private String schoolName;//学校名称
    private String educationBackGround;//学历
    private String major;//专业
    private String eduBeginYear;//开始年份
    private String eduEndYear;//毕业年份

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getReid() {
        return reid;
    }

    public void setReid(int reid) {
        this.reid = reid;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getEducationBackGround() {
        return educationBackGround;
    }

    public void setEducationBackGround(String educationBackGround) {
        this.educationBackGround = educationBackGround;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEduBeginYear() {
        return eduBeginYear;
    }

    public void setEduBeginYear(String eduBeginYear) {
        this.eduBeginYear = eduBeginYear;
    }

    public String getEduEndYear() {
        return eduEndYear;
    }

    public void setEduEndYear(String eduEndYear) {
        this.eduEndYear = eduEndYear;
    }
}
