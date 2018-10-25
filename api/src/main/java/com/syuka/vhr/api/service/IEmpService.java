package com.syuka.vhr.api.service;

import com.syuka.vhr.api.model.Employee;
import com.syuka.vhr.api.model.Nation;
import com.syuka.vhr.api.model.PoliticsStatus;

import java.util.List;

/**
 * Created by sang on 2018/1/12.
 */
public interface IEmpService {

    public List<Nation> getAllNations();

    public List<PoliticsStatus> getAllPolitics();

    public int addEmp(Employee employee);

    public Long getMaxWorkID();

    public List<Employee> getEmployeeByPage(Integer page, Integer size, String keywords, Long politicId, Long nationId, Long posId, Long jobLevelId, String engageForm, Long departmentId, String beginDateScope);

    public Long getCountByKeywords(String keywords, Long politicId, Long nationId, Long posId, Long jobLevelId, String engageForm, Long departmentId, String beginDateScope);

    public int updateEmp(Employee employee);

    public boolean deleteEmpById(String ids);

    public List<Employee> getAllEmployees();

    public int addEmps(List<Employee> emps);

    public List<Employee> getEmployeeByPageShort(Integer page, Integer size);
}
