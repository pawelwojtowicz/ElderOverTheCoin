package com.gutfilin.overthecoin.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@RequestMapping( method = RequestMethod.GET , value= "/student/{studentId}")
	Student getStudentById(@PathVariable long studentId ) {
		return service.getStudentById(studentId);	
	}

}
