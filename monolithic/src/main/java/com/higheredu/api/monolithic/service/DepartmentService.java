package com.higheredu.api.monolithic.service;

import java.util.List;

import com.higheredu.api.monolithic.model.Department;


public interface DepartmentService {
	
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
    Department updateDepartment(Long departmentId, Department department);
    List<Department> getAllDepartments();
    void deleteDepartment(Long departmentId);
}
