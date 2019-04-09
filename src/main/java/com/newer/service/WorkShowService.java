package com.newer.service;

import com.newer.domain.WorkShow;
import java.util.List;

public interface WorkShowService {
    int addWorkShow(WorkShow workShow);
    List<WorkShow> selectWorkShow(Integer reid);
}
