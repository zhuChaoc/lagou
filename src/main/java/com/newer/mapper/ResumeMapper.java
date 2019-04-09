package com.newer.mapper;

import com.newer.domain.Resume;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ResumeMapper {
    @Update("update resume set MYDESCRIBE=#{myDescribe} where REID=#{reid}")
    int updateMyDescribe(Resume resume);

    @Select("select MYDESCRIBE from resume where reid=#{reid}")
    Resume selectMyDescribe(@Param("reid") Integer reid);
}
