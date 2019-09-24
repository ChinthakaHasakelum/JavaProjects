package com.hasakelum.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.hasakelum.app.repository.EmployeeRespository;
import com.hasakelum.app.repository.HibernateRepository;
import com.hasakelum.app.service.EmployeeService;
import com.hasakelum.app.service.EmployeeServiceImpl;

@Configuration

@ComponentScan("com.hasakelum")
@PropertySource("application.properties")
public class ApplicationConfiguration {

	@Bean(name="employeeService")
	public EmployeeService getEmployeeService(){
		
		EmployeeServiceImpl employeeServiceImpl=new EmployeeServiceImpl();
		//employeeServiceImpl.setEmployeeRespository(getEmployeeRepository());
		
		return employeeServiceImpl;
	}
	
	
	
	
	
	
//	@Bean(name="employeeRespository")
//	public EmployeeRespository getEmployeeRepository(){
//		
//		return new HibernateRepository();
//	}
	
	
	
	
}
