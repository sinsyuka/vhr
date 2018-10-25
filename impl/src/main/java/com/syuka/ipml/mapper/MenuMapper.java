package com.syuka.ipml.mapper;

import com.syuka.vhr.api.dao.MenuDao;
import com.syuka.vhr.api.model.Menu;

import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
public interface MenuMapper extends MenuDao {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
