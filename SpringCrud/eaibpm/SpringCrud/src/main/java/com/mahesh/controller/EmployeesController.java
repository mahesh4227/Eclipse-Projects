package com.mahesh.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mahesh.model.Employees;
import com.mahesh.service.EmployeesService;

@Controller
public class EmployeesController {
	@Autowired
	private EmployeesService employeeService;
	
	@RequestMapping("/index")
	public String setupFrom(Map<String,Object>map)
	{
		Employees employee=new Employees();
		map.put("employee",employee);
		map.put("employeeList",employeeService.getAllEmployees());
		return "employee";
	}
	
	@RequestMapping(value="/employee.do",method=RequestMethod.POST)
	public String doActions(@ModelAttribute Employees employee, BindingResult result, @RequestParam String action,Map<String,Object>map)
	{
		Employees employeeResult=new Employees();
		switch(action.toLowerCase())
		{
		case "add":
			employeeService.add(employee);
			employeeResult=employee;
			break;
			
		case "edit":
			employeeService.edit(employee);
			employeeResult=employee;
			break;
			
		case "delete":
			employeeService.delete(employee.getId());
			employeeResult=new Employees();
			break;
		case "search":
			Employees searchedEmployee=employeeService.getEmployees(employee.getId());
			employeeResult=searchedEmployee!=null?searchedEmployee:new Employees();
			break;
		}
		map.put("employee",employeeResult);
		map.put("employeeList",employeeService.getAllEmployees());
		return "employee";
	}
}
