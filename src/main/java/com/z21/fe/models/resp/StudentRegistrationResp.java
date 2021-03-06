package com.z21.fe.models.resp;

import com.z21.fe.models.AbstractResp;


public class StudentRegistrationResp extends AbstractResp{
	
	
	private Long studentId;
	
	private String studentName;
	
	private String emailAddress;
	
	private String enrollmentStatus;
	
	private String studentType;
	
	private String paymentSelected;
	
	private String notes;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEnrollmentStatus() {
		return enrollmentStatus;
	}

	public void setEnrollmentStatus(String enrollmentStatus) {
		this.enrollmentStatus = enrollmentStatus;
	}

	public String getStudentType() {
		return studentType;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}


	public String getPaymentSelected() {
		return paymentSelected;
	}

	public void setPaymentSelected(String paymentSelected) {
		this.paymentSelected = paymentSelected;
	}
	

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
