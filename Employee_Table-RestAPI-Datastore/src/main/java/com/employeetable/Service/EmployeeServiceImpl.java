package com.employeetable.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeetable.Entity.EmployeeEntity;
import com.employeetable.Repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo emprepo;
	@Override
	public EmployeeEntity empsave(EmployeeEntity emp) {
		EmployeeEntity emp1 = emprepo.save(emp);
		return emp1;
	}

	@Override
	public List<EmployeeEntity> getEmpData() {
		List<EmployeeEntity> emp2 = emprepo.findAll();
		return emp2;
	}

	@Override
	public EmployeeEntity empUpdate(EmployeeEntity updateEmp) {
		EmployeeEntity emp3 = emprepo.save(updateEmp);
		return emp3;
	}

	@Override
	public void deleteEmp(Integer empid) {
		EmployeeEntity emp4 = emprepo.findById(empid).get();
		emprepo.delete(emp4);	
	}

	@Override
	public EmployeeEntity getEmpbyId(Integer empid) {
		Optional<EmployeeEntity> emp5 = emprepo.findById(empid);
		if(emp5.isPresent()) {
			return emp5.get();
		}
		return null;
	}

}
