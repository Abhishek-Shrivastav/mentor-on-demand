package com.mentorondemand.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mentorondemand.entity.Login;
import com.mentorondemand.entity.Role;
import com.mentorondemand.entity.User;

@Service
public class LoginService {

	@Autowired
	private RestTemplate restTemp;
	
	public User login(Login login)
	{
		User user = null;
		
		user = restTemp.postForObject("http://USER/user/getUserLogin",login,User.class);
		Role role = restTemp.getForObject("http://ROLE/role/getById/"+user.getRoleId(),Role.class);
		
		if(user.getRoleId() == role.getId())
			return user;
		
		return user;
	}
}
