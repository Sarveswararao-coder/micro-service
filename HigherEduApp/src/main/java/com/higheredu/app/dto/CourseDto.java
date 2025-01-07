package com.higheredu.app.dto;

public class CourseDto {
    private Long id;
    private String courseName;
    private String courseCode;
    private String description;

    public CourseDto() {
        // Default constructor
    }

    public CourseDto(Long id, String courseName, String courseCode, String description) {
        this.id = id;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
