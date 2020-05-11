package com.cap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.BcgDaoRepository;
import com.cap.dao.BcgStatusRepository;
import com.cap.entity.EmployeeDocumentDto;
import com.cap.entity.VerificationDto;

@Service
public class BcgServiceImpl implements  BcgService {
	@Autowired
	BcgDaoRepository  bcgdao;
	@Autowired
	BcgStatusRepository bcgstatusdao;
	@Override
	public List<EmployeeDocumentDto> getById(int empId) {
		// TODO Auto-generated method stub
		return bcgdao.getById(empId);
	}

	@Override
	public List<EmployeeDocumentDto> getByName(String empName) {
		// TODO Auto-generated method stub
		return bcgdao.getByName(empName);
	}

	@Override
	public VerificationDto setStatus(VerificationDto verificationdto) {
		// TODO Auto-generated method stub
		return bcgstatusdao.save(verificationdto);
		
	}

}
