package com.hasakelum.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hasakelum.app.model.Employee;
import com.hasakelum.app.repository.EmployeeRespository;
import com.hasakelum.app.repository.HibernateRepository;

@Service("employeeService")

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRespository employeeRespository;//=new HibernateRepository();

	@Override
	public List<Employee> getAllEmployee() {
	
		return employeeRespository.getAllEmployee();
		
	}

	public EmployeeRespository getEmployeeRespository() {
		return employeeRespository;
	}

	public void setEmployeeRespository(EmployeeRespository employeeRespository) {
		this.employeeRespository = employeeRespository;
	} 
	
	
	
	

}
