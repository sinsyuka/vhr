package com.syuka.impl.mapper;

import com.syuka.vhr.api.dao.JobLevelDao;
import com.syuka.vhr.api.model.JobLevel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sang on 2018/1/11.
 */
@Repository
public interface JobLevelMapper extends JobLevelDao {
    JobLevel getJobLevelByName(String name);

    int addJobLevel(@Param("jobLevel") JobLevel jobLevel);

    List<JobLevel> getAllJobLevels();

    int deleteJobLevelById(@Param("ids") String[] ids);

    int updateJobLevel(@Param("jobLevel") JobLevel jobLevel);
}
