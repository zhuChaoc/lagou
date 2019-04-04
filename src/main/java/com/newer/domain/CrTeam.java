package com.newer.domain;

import java.io.Serializable;

/**
 * 公司创始团队类
 */
public class CrTeam implements Serializable {

    private Integer id;  //创始人id
    private String createName; //创始人名字
    private String  job;//职位
    private String ownUrl;//个人网页
    private String ownInfo;//个人简介
    private String ownPhoto;//个人照片

    public CrTeam() {
    }

    public CrTeam(Integer id, String createName, String job, String ownUrl, String ownInfo, String ownPhoto) {
        this.id = id;
        this.createName = createName;
        this.job = job;
        this.ownUrl = ownUrl;
        this.ownInfo = ownInfo;
        this.ownPhoto = ownPhoto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getOwnUrl() {
        return ownUrl;
    }

    public void setOwnUrl(String ownUrl) {
        this.ownUrl = ownUrl;
    }

    public String getOwnInfo() {
        return ownInfo;
    }

    public void setOwnInfo(String ownInfo) {
        this.ownInfo = ownInfo;
    }

    public String getOwnPhoto() {
        return ownPhoto;
    }

    public void setOwnPhoto(String ownPhoto) {
        this.ownPhoto = ownPhoto;
    }
}
