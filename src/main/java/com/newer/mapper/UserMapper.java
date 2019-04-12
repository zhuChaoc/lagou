package com.newer.mapper;

import com.newer.domain.Menu;
import com.newer.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface UserMapper {

    @Select("select * from user where email=#{email}")
    User findByEmail(@Param("email") String email);

    @Insert("insert into lagou.user(id,password,email,level) values(null,#{password},#{email}," +
            " #{level})")
    int addUser(User user);

    @Update("update user set username=#{userName},job=#{job} where id=#{id}")
    int updateUser(User user);

    @Select("select * from user where email=#{email} and password=#{password}")
    User findByLoginInfo(@Param("email") String email, @Param("password") String password);

    @Select("SELECT m.* FROM user_menu um LEFT JOIN menu m ON um.menuid=m.id WHERE um.loginerid=#{userid}")
    List<Menu> findMenusByUserId(@Param("userid") Integer userid);

    @Insert("insert into user_menu values(null,#{loginerid},#{menuid})")
    int addUserMenu(@Param("loginerid") int loginerid, @Param("menuid") int menuid);
 }
