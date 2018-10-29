package com.syuka.impl.mapper;

import com.syuka.vhr.api.dao.MenuDao;
import com.syuka.vhr.api.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
@Repository
public interface MenuMapper extends MenuDao {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
