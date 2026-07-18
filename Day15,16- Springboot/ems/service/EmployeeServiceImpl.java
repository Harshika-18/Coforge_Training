package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepo repo;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean saveEmployee(Employee employee) throws InvalidEmployeeObjectException {
		if(employee != null && employee.getEid() > 0 && employee.getEname() != null && employee.getEsalary() > 0 && employee.getDno() > 0) {
			repo.save(employee); //save is create and update.
			return true;
		} else {
			throw new InvalidEmployeeObjectException();
		}		
	}

	@Override
	public boolean updateEmployee(int eid, Employee employee) throws InvalidEmployeeObjectException, EmployeeNotFoundException {
		if(eid > 0 && employee != null && employee.getEid() > 0 && employee.getEname() != null && employee.getEsalary() > 0 && employee.getDno() > 0) {
			if(!repo.existsById(eid)) {
				throw new EmployeeNotFoundException();
			}
			repo.save(employee); //save is create and update.
			return true;
		} else {
			throw new InvalidEmployeeObjectException();
		}	
	}

	@Override
	public boolean deleteEmployee(int eid) throws InvalidEmployeeObjectException, EmployeeNotFoundException {
		if(eid > 0) {
			if(!repo.existsById(eid)) {
				throw new EmployeeNotFoundException();
			}
			repo.deleteById(eid);
			return true;
		} else {
			throw new InvalidEmployeeObjectException();
		}
	}

	@Override
	public Optional<Employee> findEmployee(int eid) throws InvalidEmployeeObjectException, EmployeeNotFoundException {
		if(eid > 0) {
			if(!repo.existsById(eid)) {
				throw new EmployeeNotFoundException();
			}
			return repo.findById(eid);
		} else {
			throw new InvalidEmployeeObjectException();
		}
	}

	@Override
	public List<Employee> findAllEmployees() {
		List<Employee> employees = (List<Employee>) repo.findAll();
		return employees;
	}

	@Override
	public List<Employee> findByEname(String ename) throws InvalidEmployeeObjectException, EmployeeNotFoundException {
		List<Employee> employees = null;
		if(ename != null ) {
			employees = repo.findByEname(ename);
			if(employees.isEmpty()) {
				throw new EmployeeNotFoundException();
			}
			return employees;
			
		} else {
			throw new InvalidEmployeeObjectException();
		}
	}

	@Override
	@Transactional
	public boolean deleteByEname(String ename) throws InvalidEmployeeObjectException, EmployeeNotFoundException {
		if(ename != null) {
			int n = repo.deleteByEname(ename);
			if(n == 0) {
				throw new EmployeeNotFoundException();
			}
			return true;
		}
		throw new InvalidEmployeeObjectException();
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
	
	

}
