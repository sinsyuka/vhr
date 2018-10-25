package com.syuka.vhr.api.service;


import com.syuka.vhr.api.model.Role;

import java.util.List;

/**
 * Created by sang on 2018/1/1.
 */
public interface IRoleService {

    public List<Role> roles();

    public int addNewRole(String role, String roleZh);

    public int deleteRoleById(Long rid);
}
