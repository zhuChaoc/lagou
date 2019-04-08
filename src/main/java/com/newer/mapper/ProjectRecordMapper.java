package com.newer.mapper;

import com.newer.domain.ProjectRecord;
import org.apache.ibatis.annotations.Insert;

public interface ProjectRecordMapper {

    @Insert("insert into project_record values (null,#{reid},#{wname},#{wjob}," +
            "#{beginYear},#{beginMonth},#{endYear},#{endMonth},#{describle})")
    int addProjectRecord(ProjectRecord projectRecord);

}
