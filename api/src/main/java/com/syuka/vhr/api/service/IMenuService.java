package com.syuka.vhr.api.service;


import com.syuka.vhr.api.model.Menu;

import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
public interface IMenuService {

    public List<Menu> getAllMenu();

    public List<Menu> getMenusByHrId();

    public List<Menu> menuTree();

    public List<Long> getMenusByRid(Long rid);
}
