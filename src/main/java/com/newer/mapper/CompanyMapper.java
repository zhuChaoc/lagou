package com.newer.mapper;

import com.newer.domain.Company;
import com.newer.domain.CpProduct;
import com.newer.domain.CrTeam;
import org.apache.ibatis.annotations.*;

public interface CompanyMapper {
    @Insert("insert into lagou.company(id,cpphone,cpemail) values(null,#{cpPhone},#{cpEmail})")
    int addCompany1(@Param("cpPhone")String cpPhone,@Param("cpEmail")String cpEmail);
    @Update("update lagou.company set cpname=#{cpName} where id=#{id}")
    int addCompany2(@Param("cpName")String coName,@Param("id")int id);
    @Select("select * from lagou.company where cpphone=#{cpPhone} and cpemail=#{cpEmail}")
    Company findByParam1(@Param("cpPhone")String cpPhone,@Param("cpEmail")String cpEmail);
    @Select("select * from lagou.company where id=#{id}")
    Company findByParam2(@Param("id")int id);

    @Update("update lagou.company set cpshort=#{cpShort},cpurl=#{cpUrl},cpcity=#{cpCity},cparea=#{cpArea}," +
            " cpsize=#{cpSize},cpdevelop=#{cpDevelop},cpinvestor=#{cpInvestor},cpshortinfo=#{cpShortInfo}," +
            " cplogo=#{cpLogo} where id=#{id}")
    int addindex1(Company company);

   @Insert("insert into lagou.cpinfo(id,cpid,cptag) values(null,#{cpId},#{cpTag})")
   int addtag(@Param("cpTig")String cpTig,@Param("cpId")int cpId);

   @Insert("insert into lagou.crteam(id,cpid,createname,job,ownurl,owninfo,ownphoto) values(" +
           "null,#{cpId},#{createName},#{job},#{ownUrl},#{ownInfo},#{ownPhoto})")
   int addcrteam(CrTeam crTeam,@Param("cpId")int cpId);

   @Insert("insert into lagou.cpproduct(id,cpid,productname,producturl,productinfo,productphoto) values(" +
           "null,#{cpId},#{productName},#{productUrl},#{productInfo},#{productPhoto})")
   int addproduct(CpProduct cpProduct,@Param("cpId")int cpId);

   @Update("update lagou.cpinfo set cplonginfo=#{cpLongInfo} where id=(select id from lagou.cpinfo where cpid=#{cpId})")
   int addtag2(@Param("cpLongInfo")String cpLongInfo,@Param("cpId")int cpId);

   @Update("update lagou.company set cplicense=#{cpLicense} where id=#{id}")
   int addindex2(@Param("cpLicense")String cpLicense,@Param("id")int id);


   Company findAll();
}
