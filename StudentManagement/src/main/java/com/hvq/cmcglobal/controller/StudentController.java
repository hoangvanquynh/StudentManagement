package com.hvq.cmcglobal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		return "add-student";
	}

	@PostMapping("students")
	public String save(@ModelAttribute Student student, Model model) {
		studentService.save(student);
		return "redirect:/";
	}
}
