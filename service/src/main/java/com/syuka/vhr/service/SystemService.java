package com.syuka.vhr.service;

import com.syuka.vhr.api.dao.SystemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sang on 2017/12/29.
 */
@Service
@Transactional
public class SystemService {
    @Autowired
    SystemDao systemDao;

}