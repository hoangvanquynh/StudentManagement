package com.hvq.cmcglobal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hvq.cmcglobal.dto.UserRegistrationDto;
import com.hvq.cmcglobal.services.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	@Autowired
	private UserService userService;

	@GetMapping
	public String showRegistration(Model model) {
		model.addAttribute("user", new UserRegistrationDto());
		return "registration";
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto dto) {
		userService.save(dto);
		return "redirect:/registration?success";
	}
}
