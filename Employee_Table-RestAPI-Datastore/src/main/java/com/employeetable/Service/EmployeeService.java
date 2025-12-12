package com.employeetable.Service;

import java.util.List;

import com.employeetable.Entity.EmployeeEntity;

public interface EmployeeService {
	
	public EmployeeEntity empsave(EmployeeEntity emp);
	public List<EmployeeEntity> getEmpData();
	public EmployeeEntity empUpdate(EmployeeEntity updateEmp);
	public void deleteEmp(Integer empid);
	public EmployeeEntity getEmpbyId(Integer empid);

}
