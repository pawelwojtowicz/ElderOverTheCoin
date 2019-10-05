package com.gutfilin.overthecoin.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;

	public Student getStudentById(long studentId) {
		return repository.findStudentByStudentId(studentId);
	}
	
	public List<Student> getAllStudents() {
		
		return repository.findAll();
	}

}
