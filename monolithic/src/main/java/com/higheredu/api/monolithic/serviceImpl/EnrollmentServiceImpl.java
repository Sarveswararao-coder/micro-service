package com.higheredu.api.monolithic.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.higheredu.api.monolithic.dto.CourseDto;
import com.higheredu.api.monolithic.dto.EnrollmentDto;
import com.higheredu.api.monolithic.dto.ResponseDto;
import com.higheredu.api.monolithic.model.Department;
import com.higheredu.api.monolithic.model.Enrollment;
import com.higheredu.api.monolithic.model.Student;
import com.higheredu.api.monolithic.repository.EnrollmentRepository;
import com.higheredu.api.monolithic.service.CourseService;
import com.higheredu.api.monolithic.service.DepartmentService;
import com.higheredu.api.monolithic.service.EnrollmentService;
import com.higheredu.api.monolithic.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EnrollmentServiceImpl implements EnrollmentService {


    
    @Autowired
    private EnrollmentRepository enrollmentRepository;
    
    @Autowired
    private StudentService studentService;
    
    @Autowired
    private DepartmentService departmentService;
    
    @Autowired
    private CourseService courseService;
    
    @Override
    public ResponseDto getEnrollment(Long enrollmentId) {
        // Find the enrollment by its ID
        Enrollment enrollment = enrollmentRepository.findById(enrollmentId)
                .orElseThrow(() -> new RuntimeException("Enrollment not found for id: " + enrollmentId));

        // Fetch student details along with department details from the student service
        Student studentResponseEntity = studentService.getStudent(enrollment.getStudentId());
        if (studentResponseEntity == null) {
            return null;
        }
       
        

        // Fetch department details from department service using enrollment details
        Department departmentResponseEntity = departmentService.getDepartmentById(enrollment.getDepartmentId());
        if (departmentResponseEntity == null) {
            return null;
        }
       

        // Fetch course details from course service using enrollment details
        CourseDto courseResponseEntity = courseService.getCourseById(enrollment.getCourseId());
        if (courseResponseEntity == null) {
            return null;
        }
        

        // Construct the final response with enrollment details
        ResponseDto responseDto = new ResponseDto();
        responseDto.setStudent(studentResponseEntity);
        responseDto.setDepartment(departmentResponseEntity);
        responseDto.setCourse(courseResponseEntity);
        responseDto.setEnrollment(enrollment);

        return responseDto;
    }


    @Override
    public EnrollmentDto saveEnrollment(EnrollmentDto enrollmentDto) {
        // Save enrollment details
        Enrollment enrollment = new Enrollment();
        enrollment.setName(enrollmentDto.getName());
        enrollment.setEmail(enrollmentDto.getEmail());
        enrollment.setStudentId(enrollmentDto.getStudentId());
        enrollment.setDepartmentId(enrollmentDto.getDepartmentId());
        enrollment.setCourseId(enrollmentDto.getCourseId());
        enrollment = enrollmentRepository.save(enrollment);

        return new EnrollmentDto(enrollment.getId(), enrollment.getName(), enrollment.getEmail(), enrollment.getStudentId(), 
                enrollment.getDepartmentId(), enrollment.getCourseId());
    }

    @Override
    public EnrollmentDto updateEnrollment(EnrollmentDto enrollmentDto) {
        // Find the enrollment by its ID
        Enrollment enrollment = enrollmentRepository.findById(enrollmentDto.getEnrollmentId())
                .orElseThrow(() -> new RuntimeException("Enrollment not found for id: " + enrollmentDto.getEnrollmentId()));
        
        // Update the enrollment details
        enrollment.setName(enrollmentDto.getName());
        enrollment.setEmail(enrollmentDto.getEmail());
        enrollment.setStudentId(enrollmentDto.getStudentId());
        enrollment.setDepartmentId(enrollmentDto.getDepartmentId());
        enrollment.setCourseId(enrollmentDto.getCourseId());
        enrollmentRepository.save(enrollment);
        
        // Return the updated enrollment details
        return new EnrollmentDto(enrollment.getId(), enrollment.getName(), enrollment.getEmail(), enrollment.getStudentId(), 
                enrollment.getDepartmentId(), enrollment.getCourseId());
    }

    @Override
    public String deleteEnrollment(Long enrollmentId) {
        // Find the enrollment by its ID
        Enrollment enrollment = enrollmentRepository.findById(enrollmentId)
                .orElseThrow(() -> new RuntimeException("Enrollment not found for id: " + enrollmentId));

        // Delete the enrollment record
        enrollmentRepository.delete(enrollment);

        return "Enrollment deleted successfully.";
    }
    }
