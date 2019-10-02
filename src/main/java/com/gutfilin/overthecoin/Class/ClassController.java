package com.gutfilin.overthecoin.Class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gutfilin.overthecoin.Student.Student;

@RestController
public class ClassController {
	@Autowired
	ClassService service;
	
	@RequestMapping( method = RequestMethod.GET , value= "/class/{classId}")
	SchoolClass getClassByClassId(@PathVariable long classId) {
		return service.getClassByClassId( classId);
	}
	
}
