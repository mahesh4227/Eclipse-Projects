package com.mahesh.service;

import java.util.List;

import com.mahesh.model.Employees;

public interface EmployeesService {
	
	public void add(Employees employee);
	public void edit(Employees employee);
	public void delete(int id);
	public Employees getEmployees(int id);
	public List getAllEmployees();

}
