package com.coforge.dms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.dms.model.Department;
import com.coforge.dms.service.DepartmentService;

@RestController
@RequestMapping("api/v1/dms")
public class DepartmentController {
	
	private DepartmentService service;
	private Environment environment;
	public DepartmentController(DepartmentService service, Environment environment) {
		super();
		this.service = service;
		this.environment = environment;
	}
	
	@GetMapping("/departments")
	public ResponseEntity<?> findAllDepartments() {
		ResponseEntity<?> responseEntity = null;
		List<Department> departments = service.findAllDepartments();
		responseEntity = new ResponseEntity<>(departments, HttpStatus.OK);
		return responseEntity;
		
	}
	@GetMapping("/departments/{dno}")
	public ResponseEntity<?> findByDno(@PathVariable("dno") int dno) {
		ResponseEntity<?> responseEntity = null;
		Optional<Department> department = service.findByDno(dno);
		if(department.isPresent()) {
			responseEntity = new ResponseEntity<>(department.get(), HttpStatus.OK);
		}
		return responseEntity;
	}

}
