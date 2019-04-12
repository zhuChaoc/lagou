package com.newer.domain;

import java.util.List;

/**
 * @Author：ningbo
 * @Date:2019/4/5
 * @Description:com.newer.domain
 * @Version:1.0
 */
public class AuthUser {
    private User user;
    private List<Menu> menus;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}
