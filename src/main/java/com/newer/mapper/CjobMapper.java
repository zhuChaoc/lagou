package com.newer.mapper;

import com.newer.domain.Cjob;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CjobMapper {
    @Select("select * from Cjob where jsid=#{jsid}")
    List<Cjob> selectCjob(@Param("jsid") Integer jsid);
    @Insert("insert into cjob values(null,#{jsid},#{jid})")
    int insertCjob(@Param("jsid") Integer jsid,@Param("jid") Integer jid);
    @Delete("delete from cjob where jsid=#{jsid} and jid=#{jid}")
    int deleteCjob(@Param("jsid") Integer jsid,@Param("jid") Integer jid);
}
