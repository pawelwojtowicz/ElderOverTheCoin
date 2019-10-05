package com.gutfilin.overthecoin.Class;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {
	@Autowired
	ClassService service;
	
    @RequestMapping( method= RequestMethod.POST, value = "/class")
    public SchoolClass addClass(@RequestBody SchoolClass schoolClass) {
    	return service.addSchoolClass(schoolClass);
    }
	
	@RequestMapping( method = RequestMethod.GET , value= "/class/{classId}")
	SchoolClass getClassByClassId(@PathVariable long classId) {
		return service.getClassByClassId( classId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/classes")
	List<SchoolClass> getAllClasses() {
		return service.getAllClasses();
	}
	
}
