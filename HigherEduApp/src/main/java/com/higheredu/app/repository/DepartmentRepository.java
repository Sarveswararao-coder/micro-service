package com.higheredu.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higheredu.app.model.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
