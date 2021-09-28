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
		Student student1 = new Student("Hoang", "Quynh", "abc@gmail.com", "CMC Golobal");
		studentRepo.save(student1);
		
	}
	


}
