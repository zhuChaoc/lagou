package com.newer.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 简历表
 */
public class Resume implements Serializable {
      private Integer reid;
      private String rname;
      private Date alterTime;
      private String myDescribe;
      //缺少期待工作
      private Integer jid;
      private List<WorkShow> workShows;
      private List<WorkRecord> workRecords;
      private List<ProjectRecord> projectRecords;
      private List<EduRecord> eduRecords;

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Date getAlterTime() {
        return alterTime;
    }

    public void setAlterTime(Date alterTime) {
        this.alterTime = alterTime;
    }

    public String getMyDescribe() {
        return myDescribe;
    }

    public void setMyDescribe(String myDescribe) {
        this.myDescribe = myDescribe;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public List<WorkShow> getWorkShows() {
        return workShows;
    }

    public void setWorkShows(List<WorkShow> workShows) {
        this.workShows = workShows;
    }

    public List<WorkRecord> getWorkRecords() {
        return workRecords;
    }

    public void setWorkRecords(List<WorkRecord> workRecords) {
        this.workRecords = workRecords;
    }

    public List<ProjectRecord> getProjectRecords() {
        return projectRecords;
    }

    public void setProjectRecords(List<ProjectRecord> projectRecords) {
        this.projectRecords = projectRecords;
    }

    public List<EduRecord> getEduRecords() {
        return eduRecords;
    }

    public void setEduRecords(List<EduRecord> eduRecords) {
        this.eduRecords = eduRecords;
    }
}
