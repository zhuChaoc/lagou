package com.newer.domain;

import java.io.Serializable;

public class WorkShow implements Serializable {
    private Integer wsid;//作品id
    private Integer reid;//简历id
    private String workLink;//作品链接
    private String workDescribe;//作品描述
    public Integer getWsid() {
        return wsid;
    }

    public void setWsid(Integer wsid) {
        this.wsid = wsid;
    }

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public String getWorkLink() {
        return workLink;
    }

    public void setWorkLink(String workLink) {
        this.workLink = workLink;
    }

    public String getWorkDescribe() {
        return workDescribe;
    }

    public void setWorkDescribe(String workDescribe) {
        this.workDescribe = workDescribe;
    }
}
