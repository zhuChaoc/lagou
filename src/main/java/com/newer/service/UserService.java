package com.newer.service;

import com.newer.domain.AuthUser;
import com.newer.domain.Menu;
import com.newer.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author：ningbo
 * @Date:2019/4/3
 * @Description:com.newer.service
 * @Version:1.0
 */
public interface UserService {
    public User findByEmail(String email);

    public AuthUser register(User user);

    public int updateUser(User user);

    public AuthUser login(String email, String password);

    public int addUserMenu(int loginerid, int menuid);

}
