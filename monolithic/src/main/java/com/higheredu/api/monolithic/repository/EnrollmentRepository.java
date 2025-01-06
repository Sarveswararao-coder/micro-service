package com.higheredu.api.monolithic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higheredu.api.monolithic.model.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
