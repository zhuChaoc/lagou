package com.newer.domain;

import java.io.Serializable;

/**
 * 登录者-公司关联类
 */
public class UserCompany implements Serializable {
    private Integer id;
    private Integer userId;//登录者id
    private Integer cpId;//公司id

    public UserCompany() {
    }

    public UserCompany(Integer id, Integer userId, Integer cpId) {
        this.id = id;
        this.userId = userId;
        this.cpId = cpId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCpId() {
        return cpId;
    }

    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }
}
