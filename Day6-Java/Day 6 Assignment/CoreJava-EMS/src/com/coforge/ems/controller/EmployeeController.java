package com.coforge.ems.controller;

import java.sql.SQLException;
import java.util.List;

import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;
import com.coforge.ems.util.ApplicationProperties;

public class EmployeeController {
	private EmployeeService service = new EmployeeService();
	public String createEmployee(Employee employee) {
		String result = "";
		
		try {
			int n = service.createEmployee(employee);
			if(n == 1)
				result = ApplicationProperties.insertSuccess;
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		} catch (InvalidEmployeeObjectException e) {
			result =  e.toString() ;
		}
		
		return result;
	}
	
	public String updateEmployee(Employee employee) {
		String result = "";
		
		try {
			int n = service.updateEmployee(employee);
			if(n!=0)
				result = ApplicationProperties.updateSuccess;
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		} catch (InvalidEmployeeObjectException e) {
			result = e.toString() ;
		}
		return result;
	}
	
	public String deleteEmployee(int id) {
		String result = "";
		
		try {
			int n = service.deleteEmployee(id);
			if(n!=0)
				result = ApplicationProperties.deleteSuccess;
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		} catch (InvalidEmployeeObjectException e) {
			result = e.toString();
		}
		return result;
	}
	
	public String findEmployee(int id) {
		String result = "";
		try {
			Employee employee = service.findEmployee(id);
			if(employee != null)
				result = employee.toString();
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		} catch (InvalidEmployeeObjectException e) {
			result = e.toString() ;
		}
		return result;
	}
	
	public String findAllEmployee() {
		String result = "";
		try {
			result = service.findAllEmployee().toString();
		} catch (ClassNotFoundException e) {
			result = ApplicationProperties.dbFailed;
		} catch (SQLException e) {
			result = ApplicationProperties.dbFailed;
		}
		return result;
	}
		
}

