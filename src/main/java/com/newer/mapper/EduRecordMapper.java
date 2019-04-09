package com.newer.mapper;

import com.newer.domain.EduRecord;
import org.apache.ibatis.annotations.Update;

public interface EduRecordMapper  {
    @Update("update edu_record set SCOOLNAME=#{schoolName},EDUCATION_BACKGROUND=#{educationBackGround}" +
            ",MAJOR=#{major},EDUBEGIN_YEAR=#{eduBeginYear},EDUEND_YEAR=#{eduEndYear} where eid=#{eid}")
    int updateEduRecord(EduRecord eduRecord);
}
