package com.mahesh.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mahesh.dao.EmployeeDAO;
import com.mahesh.model.Employees;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {
	
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Employees employee) {
       session.getCurrentSession().save(employee);
	}

	@Override
	public void edit(Employees employee) {
       session.getCurrentSession().update(employee);
	}

	@Override
	public void delete(int id) {
        session.getCurrentSession().delete(getEmployees(id));
	}

	@Override
	public Employees getEmployees(int id) {
		return (Employees)session.getCurrentSession().get(Employees.class,id);
	}

	@Override
	public List getAllEmployees() {
		return session.getCurrentSession().createQuery("from Employees").list();
	}

}
