package com.syuka.vhr.service;

import com.syuka.vhr.api.dao.DepartmentDao;
import com.syuka.vhr.api.model.Department;
import com.syuka.vhr.api.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sang on 2018/1/7.
 */
public class DepartmentService implements IDepartmentService {
    @Autowired
    DepartmentDao departmentDao;
    public int addDep(Department department) {
        department.setEnabled(true);
        departmentDao.addDep(department);
        return department.getResult();
    }

    public int deleteDep(Long did) {
        Department department = new Department();
        department.setId(did);
        departmentDao.deleteDep(department);
        return department.getResult();
    }

    public List<Department> getDepByPid(Long pid) {
        return departmentDao.getDepByPid(pid);
    }

    public List<Department> getAllDeps() {
        return departmentDao.getAllDeps();
    }
}
