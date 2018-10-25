package com.syuka.vhr.service;

import com.syuka.vhr.api.dao.MenuRoleDao;
import com.syuka.vhr.api.service.IMenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by sang on 2018/1/2.
 */
@Service
@Transactional
public class MenuRoleService implements IMenuRoleService {
    @Autowired
    MenuRoleDao menuRoleDao;

    public int updateMenuRole(Long rid, Long[] mids) {
        menuRoleDao.deleteMenuByRid(rid);
        if (mids.length == 0) {
            return 0;
        }
        return menuRoleDao.addMenu(rid, mids);
    }
}
