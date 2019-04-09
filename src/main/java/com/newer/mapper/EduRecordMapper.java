package com.newer.mapper;

import com.newer.domain.EduRecord;
import com.sun.prism.impl.Disposer;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EduRecordMapper  {
    @Update("update edu_record set SCOOLNAME=#{schoolName},EDUCATION_BACKGROUND=#{educationBackGround}" +
            ",MAJOR=#{major},EDUBEGIN_YEAR=#{eduBeginYear},EDUEND_YEAR=#{eduEndYear} where eid=#{eid}")
    int updateEduRecord(EduRecord eduRecord);

    @Select("select scoolname schoolName,education_background educationBackGround,major," +
            "edubegin_year eduBeginYear,eduend_year eduEndYear from edu_record where reid=#{reid}")
    List<EduRecord> selectEduRecord(Integer reid);


}
