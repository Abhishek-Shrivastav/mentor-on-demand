package com.mentorondemand.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mentorondemand.entity.Register;
import com.mentorondemand.entity.StatusResponse;

@Service
public class RegisterService {

	@Autowired
	private RestTemplate restTemp;
	
	public StatusResponse getStatusResponse(Register reg)
	{
		StatusResponse status = restTemp.postForObject("http://USER/user/save",reg,StatusResponse.class);
		
		return status;
	}
}
