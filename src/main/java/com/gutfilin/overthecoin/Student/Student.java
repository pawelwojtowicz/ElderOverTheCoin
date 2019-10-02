package com.gutfilin.overthecoin.Student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gutfilin.overthecoin.Class.SchoolClass;

@Entity
public class Student {
	
    public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long StudentId) {
		studentId = StudentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String FirstName) {
		firstName = FirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String LastName) {
		lastName = LastName;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long studentId;
    	
	private String firstName;
	private String lastName;
	
    @ManyToOne()
    @JoinColumn(name = "classId", insertable = false, updatable = false)
    @JsonIgnoreProperties(value="students")
	SchoolClass ownClass;

	public SchoolClass getOwnClass() {
		return ownClass;
	}
	public void setOwnClass(SchoolClass ownClass) {
		this.ownClass = ownClass;
	}
}
