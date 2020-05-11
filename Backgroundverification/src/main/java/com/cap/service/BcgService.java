package com.cap.service;

import java.util.List;

import com.cap.entity.EmployeeDocumentDto;
import com.cap.entity.VerificationDto;

public interface BcgService {

	List<EmployeeDocumentDto> getById(int id);

	List<EmployeeDocumentDto> getByName(String empName);

	VerificationDto setStatus(VerificationDto verificationdto);

}
