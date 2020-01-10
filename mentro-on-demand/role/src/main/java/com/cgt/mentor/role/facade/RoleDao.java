package com.cgt.mentor.role.facade;

import java.util.List;

import com.cgt.mentor.role.entity.Role;

public interface RoleDao {

	List<Role> getAllRole();
	Role getRoleById(Integer id);
	boolean saveRole(Role role);
	boolean updateRole(Role role);
	boolean deleteRole(Integer id);
}
