package com.hash.model;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	
	private int EmpId;
	private String name;
	private int age;
	
	private AllocationData allocationData;
	private Set<AllocationHistory> histories; 
	
	
	public Set<AllocationHistory> getHistories() {
		return histories;
	}

	public void setHistories(Set<AllocationHistory> histories) {
		this.histories = histories;
	}
	
	
	public Employee() {
		allocationData=new AllocationData();
		histories=new HashSet<>();
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public AllocationData getAllocationData() {
		return allocationData;
	}
	public void setAllocationData(AllocationData allocationData) {
		this.allocationData = allocationData;
	}

}
