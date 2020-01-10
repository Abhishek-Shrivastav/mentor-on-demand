package com.cgt.mentor.role.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgt.mentor.role.entity.Role;
import com.cgt.mentor.role.facade.RoleDao;
import com.cgt.mentor.role.facade.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao dao;
	
	public List<Role> getAll() {
		
		return this.dao.getAllRole();
	}

	public Role getById(Integer id) {
		
		return this.dao.getRoleById(id);
	}

	public boolean save(Role role) {
		
		return this.dao.saveRole(role);
	}

	public boolean update(Role role) {
		
		return this.dao.updateRole(role);
	}

	public boolean delete(Integer id) {
		
		return this.dao.deleteRole(id);
	}
}
