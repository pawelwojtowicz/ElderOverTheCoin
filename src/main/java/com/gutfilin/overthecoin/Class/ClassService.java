package com.gutfilin.overthecoin.Class;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {
	@Autowired
	ClassRepository repository;

	public SchoolClass getClassByClassId(long classId) {
		return repository.findSchoolClassByClassId(classId);
	}

	public SchoolClass addSchoolClass(SchoolClass schoolClass) {
		// TODO Auto-generated method stub
		return repository.save(schoolClass);
	}

	public List<SchoolClass> getAllClasses() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
