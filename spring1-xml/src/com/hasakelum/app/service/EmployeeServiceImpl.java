package com.hasakelum.app.service;

import java.util.List;


import com.hasakelum.app.model.Employee;
import com.hasakelum.app.repository.EmployeeRespository;
import com.hasakelum.app.repository.HibernateRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRespository employeeRespository;//=new HibernateRepository();

	public EmployeeServiceImpl(EmployeeRespository employeeRespository) {
		System.out.println("Constructor injected");
		this.employeeRespository=employeeRespository;
	}
	
	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeRespository getEmployeeRespository() {
		return employeeRespository;
	}

	public void setEmployeeRespository(EmployeeRespository employeeRespository) {
		
		System.out.println("Setter injected");
		this.employeeRespository = employeeRespository;
	}

	@Override
	public List<Employee> getAllEmployee() {
	
		return employeeRespository.getAllEmployee();
		
	} 
	
	
	
	

}
