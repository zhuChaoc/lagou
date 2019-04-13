package com.newer.service;

import com.newer.domain.Cjob;
import java.util.List;

public interface CjobService {
    List<Cjob> selectCjob(Integer jsid);
    int insertCjob(Integer jsid,Integer jid);
    int deleteCjob(Integer jsid,Integer jid);
}
