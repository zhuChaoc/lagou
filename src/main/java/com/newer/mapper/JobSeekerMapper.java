package com.newer.mapper;

import com.newer.domain.JobSeeker;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


public interface JobSeekerMapper {
     @Insert("insert into jobseeker values(null,#{EMAIL},#{PWD},null,null,null,null,null,null,null,null)")
     int addJobSeeker(JobSeeker jobSeeker);
     @Select("SELECT COUNT(JID) FROM JOBSEEKER WHERE EMAIL=#{EMAIL}")
     int selectEamil(@Param("EMAIL") String EMAIL);
     @Select("select * from jobseeker where EMAIL=#{EMAIL} and PWD=#{PWD}")
     JobSeeker selectJobSeeker(@Param("EMAIL") String EMAIL,@Param("PWD") String PWD);
     @Update("update jobseeker set JNAME=#{JNAME},EDUCATION=#{EDUCATION}," +
             "SEX=#{SEX},WORKTIME=#{WORKTIME},EMAIL=#{EMAIL},MOBILE=#{MOBILE} where JID=#{JID}")
     int updateJobSeeker(JobSeeker jobSeeker);
     @Update("update jobseeker set SEEKER_PIC=#{SEEKER_PIC} where JID=#{JID}")
     int updatePic(JobSeeker jobSeeker);
}
