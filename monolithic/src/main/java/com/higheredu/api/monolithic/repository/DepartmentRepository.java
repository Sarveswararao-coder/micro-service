package com.higheredu.api.monolithic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higheredu.api.monolithic.model.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
