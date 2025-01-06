package com.higheredu.api.monolithic.service;

import com.higheredu.api.monolithic.dto.EnrollmentDto;
import com.higheredu.api.monolithic.dto.ResponseDto;

public interface EnrollmentService {
    String deleteEnrollment(Long enrollmentId);

	ResponseDto getEnrollment(Long enrollmentId);

	EnrollmentDto saveEnrollment(EnrollmentDto enrollmentDto);

	EnrollmentDto updateEnrollment(EnrollmentDto enrollmentDto);
}
