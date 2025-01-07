package com.higheredu.app.dto;

public class EnrollmentDto {
    private Long enrollmentId;
    private String name;
    private String email;
    private Long studentId;
    private Long departmentId;
    private Long courseId;

    
    public EnrollmentDto() {}

    public EnrollmentDto(Long enrollmentId, String name, String email, Long studentId, Long departmentId, Long courseId) {
        this.enrollmentId = enrollmentId;
        this.name = name;
        this.email = email;
        this.studentId = studentId;
        this.departmentId = departmentId;
        this.courseId = courseId;
    }
    
    // Getters and Setters
    public Long getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Long enrollmentId) {
        this.enrollmentId = enrollmentId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}
