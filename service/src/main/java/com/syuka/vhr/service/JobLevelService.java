package com.syuka.vhr.service;

import com.syuka.vhr.api.dao.JobLevelDao;
import com.syuka.vhr.api.model.JobLevel;
import com.syuka.vhr.api.service.IJobLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sang on 2018/1/11.
 */
@Service
@Transactional
public class JobLevelService implements IJobLevelService {
    @Autowired
    JobLevelDao jobLevelDao;

    public int addJobLevel(JobLevel jobLevel) {
        if (jobLevelDao.getJobLevelByName(jobLevel.getName()) != null) {
            return -1;
        }
        return jobLevelDao.addJobLevel(jobLevel);
    }

    public List<JobLevel> getAllJobLevels() {
        return jobLevelDao.getAllJobLevels();
    }

    public boolean deleteJobLevelById(String ids) {
        String[] split = ids.split(",");
        return jobLevelDao.deleteJobLevelById(split) == split.length;
    }

    public int updateJobLevel(JobLevel jobLevel) {
        return jobLevelDao.updateJobLevel(jobLevel);
    }
}
