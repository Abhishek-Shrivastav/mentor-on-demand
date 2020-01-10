package com.mentorondemand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentorondemand.entity.Login;
import com.mentorondemand.entity.User;
import com.mentorondemand.login.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@PostMapping("/")
	public User loginService(@RequestBody Login login)
	{
		User user = null;
		
		try
		{
			user = this.service.login(login);
		}
		catch(Exception e)
		{
			user = null;
		}
		
		return user;
	}
}
