package com.newer.mapper;

import com.newer.domain.JobSeeker;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface JobSeekerMapper {

     @Insert("insert into jobseeker values(null,#{EMAIL},#{PWD},null,null,null,null,null,null,null,null)")
     int addJobSeeker(JobSeeker jobSeeker);

     @Select("SELECT COUNT(JID) FROM JOBSEEKER WHERE EMAIL=#{EMAIL}")
     int selectEamil(@Param("EMAIL") String EMAIL);
}
