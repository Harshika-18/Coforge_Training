package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.ems.dto.DepartmentDTO;
import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.repo.EmployeeRepo;
import com.coforge.ems.service.client.DepartmentClient;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepo repo;
	private Environment environment;
	private DepartmentClient client;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepo repo, Environment environment, DepartmentClient client) {
		super();
		this.repo = repo;
		this.environment = environment;
		this.client = client;
	}

	@Override
	public boolean saveEmployee(Employee employee){
		repo.save(employee);	
		return true;
	}

	@Override
	public boolean updateEmployee(int eid, Employee employee){
		if(!repo.existsById(eid)) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.emp-notfound"));
		}
		repo.save(employee); //save is create and update.
		return true;
	}	

	@Override
	public boolean deleteEmployee(int eid){
		if(!repo.existsById(eid)) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.emp-notfound"));
		}
		repo.deleteById(eid);
		return true;
	}

	@Override
	public Optional<Employee> findEmployee(int eid){
		if(!repo.existsById(eid)) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.emp-notfound"));
		}
		return repo.findById(eid);
	}

	@Override
	public List<Employee> findAllEmployees() {
		List<Employee> employees = (List<Employee>) repo.findAll();
		return employees;
	}

	@Override
	public List<Employee> findByEname(String ename) {
		List<Employee> employees = null;
		employees = repo.findByEname(ename);
		if(employees.isEmpty()) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.emp-notfound"));
		}
		return employees;
	}

	@Override
	@Transactional
	public boolean deleteByEname(String ename) {
		int n = repo.deleteByEname(ename);
		if(n == 0) {
			throw new EmployeeNotFoundException(environment.getProperty("ems.invalid.emp-notfound"));
		}
		return true;
	}

	@Override
	public List<Integer> getEidsList() {
		List<Integer> eids = repo.getEids();
		return eids;
	}

	@Override
	public String getinfo() {
		return repo.getinfo();
	}

	@Override
	public DepartmentDTO findDepartmentById(int dno) {
		DepartmentDTO department = client.findDepartmentById(dno);
		return department;
	}

	@Override
	public List<DepartmentDTO> findAllDepartment() {
		List<DepartmentDTO> departments = client.findAllDepartments();
		return departments;
	}
	
	

}
