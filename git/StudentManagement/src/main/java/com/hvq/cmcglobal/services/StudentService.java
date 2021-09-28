package com.hvq.cmcglobal.services;

import java.util.List;

import com.hvq.cmcglobal.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();
	void save(Student student);
}
