package com.cap.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="docuemp")
public class EmployeeDocumentDto
{
    @Id
    int empId;
    String empName;
    @GeneratedValue(generator="system-uuid")
   	@GenericGenerator(name="system-uuid", strategy = "uuid")
    int docId;
    String docType;
 
    String docData;
    public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getDocData() {
		return docData;
	}
	public void setDocData(String docData) {
		this.docData = docData;
	}
    
    	    
}
