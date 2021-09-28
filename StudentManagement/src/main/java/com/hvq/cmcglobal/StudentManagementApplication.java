package com.hvq.cmcglobal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hvq.cmcglobal.entity.Student;
import com.hvq.cmcglobal.repository.StudentRepo;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Hoang1", "Quynh1", "abc1@gmail.com", "CMC Golobal 1");
		studentRepo.save(student1);
		Student student2 = new Student("Hoang2", "Quynh2", "abc2@gmail.com", "CMC Golobal 2");
		studentRepo.save(student2);
		Student student3 = new Student("Hoang3", "Quynh3", "abc3@gmail.com", "CMC Golobal 3");
		studentRepo.save(student3);
	}
}
