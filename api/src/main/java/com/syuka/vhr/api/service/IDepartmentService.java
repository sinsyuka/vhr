package com.syuka.vhr.api.service;

import com.syuka.vhr.api.model.Department;

import java.util.List;

/**
 * Created by sang on 2018/1/7.
 */
public interface IDepartmentService {
    public int addDep(Department department);

    public int deleteDep(Long did);

    public List<Department> getDepByPid(Long pid);

    public List<Department> getAllDeps();
}
