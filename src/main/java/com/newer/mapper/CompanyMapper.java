package com.newer.mapper;

import com.newer.domain.Company;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
public interface CompanyMapper {
    @Select("select * from company where id=#{id}")
    Company selectCompany(@Param("id")Integer id);
}
