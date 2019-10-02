package com.gutfilin.overthecoin.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
	Student findStudentByStudentId(long studentId);

}