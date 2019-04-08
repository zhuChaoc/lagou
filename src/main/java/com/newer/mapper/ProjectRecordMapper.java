package com.newer.mapper;

import com.newer.domain.ProjectRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProjectRecordMapper {

    @Insert("insert into project_record values (null,#{reid},#{wname},#{wjob}," +
            "#{beginYear},#{beginMonth},#{endYear},#{endMonth},#{xmdescribe})")
    int addProjectRecord(ProjectRecord projectRecord);
    @Select("select pid,reid,wname,wjob,projectBEGIN_YEAR beginYear,projectBEGIN_MONTH beginMonth," +
            "projectEND_YEAR endYear,projectEND_MONTH endMONTH,project_describe xmdescribe from project_record where reid=#{reid}")
    List<ProjectRecord> selectProjectRecord(@Param("reid") Integer reid);
}
