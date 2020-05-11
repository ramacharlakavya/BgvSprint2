package com.cap.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.entity.EmployeeDocumentDto;


public interface BcgDaoRepository  extends JpaRepository<EmployeeDocumentDto,Integer>{
	@Query("select e from EmployeeDocumentDto e  where empId=?1 ")
	List<EmployeeDocumentDto> getById(int empId);
	@Query("select employee from EmployeeDocumentDto employee  where empName=?1 ")
	List<EmployeeDocumentDto> getByName(String empName);
	
   
}
