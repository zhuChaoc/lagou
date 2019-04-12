package com.newer.service;

import com.newer.domain.AuthUser;
import com.newer.domain.Menu;
import com.newer.domain.User;
import com.newer.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @Author：ningbo
 * @Date:2019/4/3
 * @Description:com.newer.service
 * @Version:1.0
 */
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByEmail(String email) {
        return userMapper.findByEmail(email);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public AuthUser register(User user){
        if(userMapper.addUser(user)>0){
            //添加用户成功后，根据邮箱查询这个用户
            User user1 = userMapper.findByEmail(user.getEmail());
            //如果用户类型为招人
            if(user1.getLevel().equals("1")){
                for(int i=1;i<=5;i++){
                    userMapper.addUserMenu(user1.getId(),i);//为这个用户添加菜单，给user_menu表添加记录
                }
                //如果用户类型为找工作
            }else if(user1.getLevel().equals("0")){
                for(int i=1;i<=3;i++){
                    userMapper.addUserMenu(user1.getId(),i);
                }
            }
            //查询这个用户的所有菜单
            List<Menu> menus = userMapper.findMenusByUserId(user1.getId());
            AuthUser authUser = new AuthUser();
            authUser.setUser(user1);
            authUser.setMenus(menus);
            return authUser;//返回权限用户对象
        }
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public AuthUser login(String email, String password) {
        User user = userMapper.findByLoginInfo(email,password);
        if(user!=null){
            //查询到了该用户后，再查询该用户的所有菜单
            List<Menu> menus = userMapper.findMenusByUserId(user.getId());
            AuthUser authUser=new AuthUser();
            authUser.setUser(user);
            authUser.setMenus(menus);
            return authUser;//返回权限用户对象
        }
        return null;
    }

    @Override
    public int addUserMenu(int loginerid, int menuid) {
        return userMapper.addUserMenu(loginerid,menuid);
    }
}
