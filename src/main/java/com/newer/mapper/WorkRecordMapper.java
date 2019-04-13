package com.newer.mapper;

import com.newer.domain.WorkRecord;
import com.newer.domain.WorkShow;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WorkRecordMapper {
    @Insert("insert into work_record values (null,#{reid},#{companyName},#{jobName},#{workBeginYear}" +
            ",#{workBeginMonth},#{workEndYear},#{workEndMonth})")
    int addWorkRecord(WorkRecord workRecord);
    @Select("select wid,reid,COMPANY_NAME companyName,jobname,WORKBEGIN_YEAR workBeginYear," +
            "WORKBEGIN_MONTH workBeginMonth,WORKEND_YEAR workEndYear,WORKEND_MONTH workEndMonth from work_record where reid=#{reid}")
    List<WorkRecord> selectWorkRecord(@Param("reid") Integer reid);

    @Delete("delete  from work_record where wid=#{wid}")
    int deleteWorkRecord(@Param("wid") int wid);
}
