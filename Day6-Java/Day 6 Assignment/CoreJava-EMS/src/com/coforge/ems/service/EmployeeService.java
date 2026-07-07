package com.coforge.ems.service;

import java.sql.SQLException;
import java.util.List;

import com.coforge.ems.dao.EmployeeDAO;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public class EmployeeService {
	private EmployeeDAO dao = new EmployeeDAO();
	public int createEmployee(Employee employee) throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		int n = 0 ;
		if(employee != null && employee.getEid() > 0 && employee.getEname() != null && employee.getEsalary() > 0) {
			n = dao.createEmployee(employee);
		} else {
			throw new InvalidEmployeeObjectException();
		}
		return n;
	}
	
	public int updateEmployee(Employee employee) throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		int n = 0;
		if(employee != null && employee.getEid() > 0 && employee.getEname() != null && employee.getEsalary() > 0) {
			n = dao.updateEmployee(employee);
		} else {
			throw new InvalidEmployeeObjectException();
		}
		return n;
	}
	
	public int deleteEmployee(int id) throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		if(id > 0) {
			return dao.deleteEmployee(id);
		} else {
			throw new InvalidEmployeeObjectException();
		}
	}
	
	public Employee findEmployee(int id) throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {
		if(id > 0) {
			return dao.findEmployee(id);
		} else {
			throw new InvalidEmployeeObjectException();
		}
	}

	public List<Employee> findAllEmployee() throws ClassNotFoundException, SQLException {
		return dao.findAllEmployee();
	}
	

}
