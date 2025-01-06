package com.higheredu.api.monolithic.service;

import com.higheredu.api.monolithic.model.Student;

public interface StudentService {
    Student saveStudent(Student student);

    Student getStudent(Long studentId);
    
    
    String deleteStudent(Long studentId);

	Student updateStudent(Long studentId, Student student);
}
