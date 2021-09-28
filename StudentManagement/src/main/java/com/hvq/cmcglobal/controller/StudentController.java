package com.hvq.cmcglobal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hvq.cmcglobal.entity.Student;
import com.hvq.cmcglobal.services.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("")
	public String index(Model model) {
		model.addAttribute("students", studentService.getAllStudent());
		return "index";
	}

	@GetMapping("/student/new")
	public String create(Model model) {
		model.addAttribute("student", new Student());
		return "add_student";
	}

	@PostMapping("/students")
	public String save(@ModelAttribute Student student, Model model) {
		studentService.save(student);
		return "redirect:/";
	}
	
	@GetMapping("/student/edit/{id}")
	public String editStudent(@PathVariable Long id, Model model) {
		Student student = studentService.getStudentByID(id);
		String fullName = student.getFirstName() + " " + student.getLastName();
		model.addAttribute("student", student);
		model.addAttribute("fullName" , fullName);
		return "edit_student";
	}
	
	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute Student student, Model model) {
		Student currentStudent = studentService.getStudentByID(id);
		currentStudent.setId(student.getId());
		currentStudent.setFirstName(student.getFirstName());
		currentStudent.setLastName(student.getLastName());
		currentStudent.setEmail(student.getEmail());
		currentStudent.setAddress(student.getAddress());
		studentService.save(currentStudent);
		return "redirect:/";
	}
	
	@GetMapping("/student/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/";
	}
}
