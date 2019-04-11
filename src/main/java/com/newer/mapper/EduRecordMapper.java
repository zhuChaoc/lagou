package com.newer.mapper;
import com.newer.domain.EduRecord;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EduRecordMapper  {
    @Update("update edu_record set SCOOLNAME=#{schoolName},EDUCATION_BACKGROUND=#{educationBackGround}" +
            ",MAJOR=#{major},EDUBEGIN_YEAR=#{eduBeginYear},EDUEND_YEAR=#{eduEndYear} where eid=#{eid}")
    int updateEduRecord(EduRecord eduRecord);

    @Select("select eid,scoolname schoolName,education_background educationBackGround,major," +
            "edubegin_year eduBeginYear,eduend_year eduEndYear from edu_record where reid=#{reid}")
    List<EduRecord> selectEduRecord(Integer reid);


    @Insert("insert into Edu_Record values(null,#{reid},#{schoolName},#{educationBackGround},#{major},#{eduBeginYear},#{eduEndYear})")
    int insetEduRecord(EduRecord eduRecord);

    @Delete("delete from edu_record where eid =#{eid}")
    int deleteEduRecord(Integer eid);

}
