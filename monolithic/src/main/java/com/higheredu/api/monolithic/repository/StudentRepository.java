package com.higheredu.api.monolithic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higheredu.api.monolithic.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
