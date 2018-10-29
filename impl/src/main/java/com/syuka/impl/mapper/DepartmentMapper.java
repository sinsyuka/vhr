package com.syuka.impl.mapper;

import com.syuka.vhr.api.dao.DepartmentDao;
import com.syuka.vhr.api.model.Department;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sang on 2018/1/7.
 */
@Repository
public interface DepartmentMapper extends DepartmentDao {
    void addDep(@Param("dep") Department department);

    void deleteDep(@Param("dep") Department department);

    List<Department> getDepByPid(Long pid);

    List<Department> getAllDeps();
}
