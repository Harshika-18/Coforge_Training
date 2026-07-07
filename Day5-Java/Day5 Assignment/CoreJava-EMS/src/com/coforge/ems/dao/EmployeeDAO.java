package com.coforge.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.coforge.ems.model.Employee;
import com.coforge.ems.util.ApplicationProperties;
import com.coforge.ems.util.DBUtil;

public class EmployeeDAO {
	public int createEmployee(Employee employee) throws ClassNotFoundException, SQLException  {
		int n = 0;
		Connection connection = DBUtil.getDBConnection();
		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.insertSql);
		statement.setInt(1, employee.getEid());
		statement.setString(2, employee.getEname());
		statement.setInt(3, employee.getEsalary());
		statement.setInt(4, employee.getDno());
		
		n = statement.executeUpdate();
		
		return n;
	}
	
	public int updateEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		int n = 0;
		Connection connection = DBUtil.getDBConnection();
		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.updateSql);
		statement.setString(1, employee.getEname());
		statement.setInt(2, employee.getEsalary());
		statement.setInt(3, employee.getDno());
		statement.setInt(4, employee.getEid());
		
		n = statement.executeUpdate();
		
		return n;		
	}
	
	public int deleteEmployee(int id) throws ClassNotFoundException, SQLException {
		int n = 0;
		Connection connection = DBUtil.getDBConnection();
		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.deleteSql);
		statement.setInt(1, id);
		
		n = statement.executeUpdate();
		
		return n;		
	}
	
	public Employee findEmployee(int id) throws ClassNotFoundException, SQLException {
		Connection connection = DBUtil.getDBConnection();
		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.findSql);
		statement.setInt(1,id);
		ResultSet result = statement.executeQuery(); 
		
		if(result.next()) {
			Employee employee = new Employee(result.getInt("eid"),result.getString("ename"), result.getInt("esalary"), result.getInt("dno"));
			return employee;
		}
		
		return null;		
	}

	public List<Employee> findAllEmployee() throws ClassNotFoundException, SQLException {
		Connection connection = DBUtil.getDBConnection();
		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.findAllSql);
		ResultSet result = statement.executeQuery();
		
		List<Employee> employeeList = new ArrayList<>();
		
		while(result.next()) {
			Employee employee = new Employee();
			employee.setEid(result.getInt("eid"));
			employee.setEname(result.getString("ename"));
			employee.setEsalary(result.getInt("esalary"));
			employee.setDno(result.getInt("dno"));
			
			employeeList.add(employee);
		}
		return employeeList;
		
		
	}
	
	
}
