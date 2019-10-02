package com.gutfilin.overthecoin.Class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {
	@Autowired
	ClassRepository repository;

	public SchoolClass getClassByClassId(long classId) {
		// TODO Auto-generated method stub
		return repository.findSchoolClassByClassId(classId);
	}

}
