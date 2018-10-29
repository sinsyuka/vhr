package com.syuka.impl.mapper;

import com.syuka.vhr.api.dao.RoleDao;
import com.syuka.vhr.api.model.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sang on 2018/1/1.
 */
@Repository
public interface RoleMapper extends RoleDao {
    List<Role> roles();

    int addNewRole(@Param("role") String role, @Param("roleZh") String roleZh);

    int deleteRoleById(Long rid);
}
