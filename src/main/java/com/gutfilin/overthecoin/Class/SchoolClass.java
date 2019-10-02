package com.gutfilin.overthecoin.Class;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.gutfilin.overthecoin.Collection.MoneyCollection;
import com.gutfilin.overthecoin.Student.Student;

@Entity
public class SchoolClass {
	
	
	public long getClassId() {
		return this.classId;
	}
	public void setClassId(long classId) {
		this.classId = classId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getLongDescription() {
		return LongDescription;
	}
	public void setLongDescription(String longDescription) {
		LongDescription = longDescription;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long classId;
	private String Description;
	private String LongDescription;
	
	@OneToMany(mappedBy = "ownClass", cascade = CascadeType.MERGE , fetch = FetchType.LAZY)
	private Set<Student> students;

	@OneToMany(mappedBy = "ownClass", cascade = CascadeType.MERGE , fetch = FetchType.LAZY)
	private Set<MoneyCollection> collections;
}
