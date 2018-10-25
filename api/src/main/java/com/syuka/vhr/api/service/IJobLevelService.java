package com.syuka.vhr.api.service;

import com.syuka.vhr.api.model.JobLevel;

import java.util.List;

/**
 * Created by sang on 2018/1/11.
 */
public interface IJobLevelService {

    public int addJobLevel(JobLevel jobLevel);

    public List<JobLevel> getAllJobLevels();

    public boolean deleteJobLevelById(String ids);

    public int updateJobLevel(JobLevel jobLevel);
}
