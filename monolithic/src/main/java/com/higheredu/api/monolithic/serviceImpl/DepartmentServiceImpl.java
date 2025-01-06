package com.higheredu.api.monolithic.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.higheredu.api.monolithic.model.Department;
import com.higheredu.api.monolithic.repository.DepartmentRepository;
import com.higheredu.api.monolithic.service.DepartmentService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).orElse(null);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department updatedDepartment) {
        return departmentRepository.findById(departmentId).map(existingDepartment -> {
        	existingDepartment.setDepartmentName(updatedDepartment.getDepartmentName());
        	existingDepartment.setDepartmentCode(updatedDepartment.getDepartmentAddress());
        	existingDepartment.setDepartmentName(updatedDepartment.getDepartmentName());
            // Any other fields to be updated
            return departmentRepository.save(existingDepartment);
        }).orElse(null);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
