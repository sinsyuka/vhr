package com.syuka.vhr.api.service;


import com.syuka.vhr.api.model.Salary;

import java.util.List;

/**
 * Created by sang on 2018/1/24.
 */
public interface ISalaryService {
    public int addSalary(Salary salary);

    public List<Salary> getAllSalary();

    public int updateSalary(Salary salary);

    public int deleteSalary(String ids);

    public int updateEmpSalary(Integer sid, Long eid);
}
