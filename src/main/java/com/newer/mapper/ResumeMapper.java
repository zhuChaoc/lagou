package com.newer.mapper;

import com.newer.domain.Resume;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ResumeMapper {
    @Update("update resume set MYDESCRIBE=#{myDescribe} where REID=#{reid}")
    int updateMyDescribe(Resume resume);
    @Update("update resume set RNAME=#{rname} where REID=#{reid}")
    int updateRname(Resume resume);
    @Select("select MYDESCRIBE from resume where reid=#{reid}")
    Resume selectMyDescribe(@Param("reid") Integer reid);
    @Select("select RNAME from resume where reid=#{reid}")
    Resume selectRname(@Param("reid") Integer reid);
    @Select("select * from resume where JID=#{jid}")
    Resume selectResume(@Param("jid") Integer jid);
}
