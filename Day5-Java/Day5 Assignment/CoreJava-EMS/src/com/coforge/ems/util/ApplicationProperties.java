package com.coforge.ems.util;

public class ApplicationProperties {
	//DataBase constants
	public static final String driver = "com.mysql.cj.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/db";
	public static final String userName = "root";
	public static final String password = "Sql#2026";
	
	//DataBase SQL Queries
	public static final String insertSql = "insert into tbl_employee values (?,?,?,?)";
	public static final String updateSql = "update tbl_employee set ename = ?, esalary = ?, dno = ? where eid = ? ";
	public static final String deleteSql = "delete from tbl_employee where eid = ? ";
	public static final String findSql = "select * from tbl_employee where eid = ?";
	public static final String findAllSql = "select * from tbl_employee";
	
	//Application Response Properties
	public static final String insertSuccess = "SUCCESS : Employee record Inserted";
	public static final String dbFailed = "FAILED : DB Error";
	public static final String updateSuccess = "SUCCESS : Records Updated Successfully.";
	public static final String deleteSuccess = "SUCCESS : Records Deleted Successfully.";

	//Application Validation Properties
	public static final String validationFail = "FAILED : Invalid Employee or details";

}
