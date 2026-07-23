package com.coforge.dms.service;

import java.util.List;
import java.util.Optional;

import com.coforge.dms.model.Department;

public interface DepartmentService {

	List<Department> findAllDepartments();

	Optional<Department> findByDno(int dno);

}
