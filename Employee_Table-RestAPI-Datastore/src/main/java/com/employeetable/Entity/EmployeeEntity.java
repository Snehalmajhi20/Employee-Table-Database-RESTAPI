package com.employeetable.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_details")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer emp_id;
	private String emp_name;
	private String email;
	private String phone_no;
	private String job_title;
	private String department;
	private String gender;
	private String salary;
	
	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(Integer emp_id, String emp_name, String email, String phone_no, String job_title,
			String department, String gender, String salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.email = email;
		this.phone_no = phone_no;
		this.job_title = job_title;
		this.department = department;
		this.gender = gender;
		this.salary = salary;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [emp_id=" + emp_id + ", emp_name=" + emp_name + ", email=" + email + ", phone_no="
				+ phone_no + ", job_title=" + job_title + ", department=" + department + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}

	
}
