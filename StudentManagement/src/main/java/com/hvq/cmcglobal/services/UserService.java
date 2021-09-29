package com.hvq.cmcglobal.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.hvq.cmcglobal.dto.UserRegistrationDto;
import com.hvq.cmcglobal.entity.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto userRegistrationDto);

}
