package com.syuka.impl.mapper;

import com.syuka.vhr.api.dao.MenuDao;
import com.syuka.vhr.api.dao.MenuRoleDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by sang on 2018/1/2.
 */
@Repository
public interface MenuRoleMapper extends MenuRoleDao {
    int deleteMenuByRid(@Param("rid") Long rid);

    int addMenu(@Param("rid") Long rid, @Param("mids") Long[] mids);
}
