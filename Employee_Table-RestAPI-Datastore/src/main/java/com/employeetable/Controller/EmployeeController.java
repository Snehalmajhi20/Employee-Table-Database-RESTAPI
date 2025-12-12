package com.employeetable.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeetable.EmployeeTableRestApiDatastoreApplication;
import com.employeetable.Entity.EmployeeEntity;
import com.employeetable.Service.EmployeeService;

@RestController
public class EmployeeController {

    private final EmployeeTableRestApiDatastoreApplication employeeTableRestApiDatastoreApplication;
	
	@Autowired
	private EmployeeService empservice;

    EmployeeController(EmployeeTableRestApiDatastoreApplication employeeTableRestApiDatastoreApplication) {
        this.employeeTableRestApiDatastoreApplication = employeeTableRestApiDatastoreApplication;
    }
	
	@PostMapping("/save")
	public ResponseEntity<?> empsave(@RequestBody EmployeeEntity emp){
		EmployeeEntity empsave1 = empservice.empsave(emp);
		
		if(ObjectUtils.isEmpty(empsave1)) {
			return new ResponseEntity<>("Employee not saved!",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			return new ResponseEntity<>(empsave1,HttpStatus.CREATED); 
		}
	}
	
	@GetMapping("/emplist")
	public ResponseEntity<?> getEmpData(){
		List<EmployeeEntity> emplist = empservice.getEmpData();
		return new ResponseEntity<>(emplist, HttpStatus.OK);
	}
	
	@PutMapping("/empupdate")
	public ResponseEntity<?> empUpdate(@RequestBody EmployeeEntity emp1){
		EmployeeEntity empup1 = empservice.empUpdate(emp1);
		if(ObjectUtils.isEmpty(empup1)) {
			return new ResponseEntity<>("Employee Not Found", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			return new ResponseEntity<>(empup1,HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/empdelete/{emp_id}")
	public ResponseEntity<?> deleteEmp(@PathVariable Integer emp_id){
		empservice.deleteEmp(emp_id);
		return new ResponseEntity<>("Employee id delete successfully",HttpStatus.OK);
	}
	
	@GetMapping("/getempbyid/{emp_id}")
	public ResponseEntity<?> getEmpbyId(@PathVariable Integer emp_id){
		EmployeeEntity emp2 = empservice.getEmpbyId(emp_id);
		if(ObjectUtils.isEmpty(emp2)) {
			return new ResponseEntity<>("Employee id not found!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			return new ResponseEntity<>(emp2, HttpStatus.OK);
		}
	}

}
