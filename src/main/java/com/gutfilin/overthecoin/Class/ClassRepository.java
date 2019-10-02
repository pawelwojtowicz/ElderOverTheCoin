package com.gutfilin.overthecoin.Class;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<SchoolClass,Long>{
	SchoolClass findSchoolClassByClassId(long classId);
}
