package com.mentorondemand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentorondemand.entity.Register;
import com.mentorondemand.entity.StatusResponse;
import com.mentorondemand.login.service.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private RegisterService service;
	
	@PostMapping("/")
	public StatusResponse save(@RequestBody Register reg)
	{
		return this.service.getStatusResponse(reg);
	}
	
	/*public StatusResponse save(Register reg)
	{
		return this.service.getStatusResponse(reg);
	}*/
}