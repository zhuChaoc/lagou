package com.newer.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserCompanyMapper {
    @Insert("insert into lagou.user_company values(null,#{userId},#{cpId})")
    int add(@Param("userId")int userId,@Param("cpId")int cpId);
}
