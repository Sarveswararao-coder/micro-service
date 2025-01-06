package com.higheredu_api.course.model;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "course_code", nullable = false)
    private String courseCode;


    @Column(name = "course_name", nullable = false)
    private String courseName;

    @Column(name = "description")
    private String description;

//    @OneToMany(mappedBy = "course")
//    private List<Enrollment> enrollments;

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public List<Enrollment> getEnrollments() {
//        return enrollments;
//    }
//
//    public void setEnrollments(List<Enrollment> enrollments) {
//        this.enrollments = enrollments;
//    }
}
