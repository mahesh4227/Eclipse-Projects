package com.mahesh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mahesh.dao.EmployeeDAO;
import com.mahesh.model.Employees;
import com.mahesh.service.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService {
	
	@Autowired
	private EmployeeDAO employeeDao;

	@Transactional
 	public void add(Employees employee) {
		employeeDao.add(employee);

	}

	@Transactional
	public void edit(Employees employee) {
		employeeDao.edit(employee);

	}

	@Transactional
	public void delete(int id) {
		employeeDao.delete(id);

	}

	@Transactional
	public Employees getEmployees(int id) {
		return employeeDao.getEmployees(id);
	}

	@Transactional
	public List getAllEmployees() {
	  return employeeDao.getAllEmployees();
	}

}
