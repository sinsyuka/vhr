package com.syuka.ipml.mapper;

import com.syuka.vhr.api.dao.MenuDao;
import org.apache.ibatis.annotations.Param;

/**
 * Created by sang on 2018/1/2.
 */
public interface MenuRoleMapper extends MenuDao {
    int deleteMenuByRid(@Param("rid") Long rid);

    int addMenu(@Param("rid") Long rid, @Param("mids") Long[] mids);
}
