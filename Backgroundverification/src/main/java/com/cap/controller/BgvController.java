package com.cap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.entity.EmployeeDocumentDto;
import com.cap.entity.LoginDto;
import com.cap.entity.VerificationDto;
import com.cap.service.BcgService;
import com.cap.service.LoginService;

@RestController
@RequestMapping("/bgv")
@CrossOrigin("http://localhost:4200")
public class BgvController {
	@Autowired
	LoginService loginservice;
	@Autowired
	BcgService bcgservice;
	@GetMapping(value="/login/{empId}/{password}")
	public ResponseEntity<LoginDto> authentication(@PathVariable("empId") int id,@PathVariable("password") String pass)
	{
		LoginDto loginobj=loginservice.authentication(id,pass);
			ResponseEntity<LoginDto> response=new ResponseEntity<LoginDto>(loginobj,HttpStatus.OK);
			return response;
		}
	@GetMapping(value="/getdocumentbyid/{empId}")
	public List<EmployeeDocumentDto>getById(@PathVariable("empId")  int empId)
	{
		
		return bcgservice.getById(empId);
	}
	@GetMapping(value="/getdocumentbyname/{empName}")
	public List<EmployeeDocumentDto>getByName(@PathVariable("empName")  String empName)
	{
	
		return bcgservice.getByName(empName);
	}
	@PutMapping(value="/setstatus")
	public ResponseEntity<String> setStatus(@RequestBody VerificationDto verificationdto)
	{
		VerificationDto vdto=bcgservice.setStatus(verificationdto);
		if(vdto!=null)
		{
			return new ResponseEntity<String>("successfull",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("unsuccessfull",HttpStatus.OK);
		}
	}
	
	
	
	
	
	}

