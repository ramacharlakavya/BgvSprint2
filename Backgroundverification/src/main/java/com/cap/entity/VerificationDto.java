package com.cap.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="verific1")

public class VerificationDto
{@Id
	@GeneratedValue
	private int verfId;
 String status;
 public int getVerfId() {
		return verfId;
	}
	public void setVerfId(int verfId) {
		this.verfId = verfId;
	}

public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
