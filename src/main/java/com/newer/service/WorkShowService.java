package com.newer.service;

import com.newer.domain.WorkShow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkShowService {
    int addWorkShow(WorkShow workShow);
    List<WorkShow> selectWorkShow(Integer reid);
    int deleteWorkShow(@Param("wsid") int wsid);
}
