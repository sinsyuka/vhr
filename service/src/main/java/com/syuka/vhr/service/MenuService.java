package com.syuka.vhr.service;

import com.syuka.vhr.api.dao.MenuDao;
import com.syuka.vhr.api.model.Menu;
import com.syuka.vhr.service.util.HrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
@Service
@Transactional
@CacheConfig(cacheNames = "menus_cache")
public class MenuService {
    @Autowired
    MenuDao menuDao;

//    @Cacheable(key = "#root.methodName")
    public List<Menu> getAllMenu(){
        return menuDao.getAllMenu();
    }

    public List<Menu> getMenusByHrId() {
        return menuDao.getMenusByHrId(HrUtils.getCurrentHr().getId());
    }

    public List<Menu> menuTree() {
        return menuDao.menuTree();
    }

    public List<Long> getMenusByRid(Long rid) {
        return menuDao.getMenusByRid(rid);
    }
}
