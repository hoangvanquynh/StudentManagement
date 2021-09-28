package com.hvq.cmcglobal.services;

import java.util.List;

import com.hvq.cmcglobal.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();
	void save(Student student);
	Student getStudentByID(Long id); 
	Student updateStudent(Student student);
	void deleteStudentById(Long id);
}
