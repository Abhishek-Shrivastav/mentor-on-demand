package com.cgt.mentor.role.facade;

import java.util.List;

import com.cgt.mentor.role.entity.Role;

public interface RoleService {

	List<Role> getAll();
	Role getById(Integer id);
	boolean save(Role role);
	boolean update(Role role);
	boolean delete(Integer id);
}
