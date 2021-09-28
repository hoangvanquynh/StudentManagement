package com.hvq.cmcglobal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hvq.cmcglobal.entity.Student;
import com.hvq.cmcglobal.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public void save(Student student) {
		studentRepo.save(student);
	}
	
	
}
