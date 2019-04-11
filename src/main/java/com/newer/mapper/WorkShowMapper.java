package com.newer.mapper;
import com.newer.domain.WorkShow;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WorkShowMapper {
    @Insert("insert into work_show values (null,#{reid},#{workLink},#{workDescribe})")
    int addWorkShow(WorkShow workShow);
    @Select("select wsid,reid,work_link workLink,work_describe workDescribe from work_show where reid=#{reid}")
    List<WorkShow> selectWorkShow(@Param("reid") Integer reid);
    @Delete("delete  from work_show where wsid=#{wsid}")
    int deleteWorkShow(@Param("wsid") int wsid);
}
