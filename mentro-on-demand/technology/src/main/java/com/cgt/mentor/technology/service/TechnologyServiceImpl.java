package com.cgt.mentor.technology.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgt.mentor.technology.entity.Technology;
import com.cgt.mentor.technology.facade.TechnologyDao;
import com.cgt.mentor.technology.facade.TechnologyService;

@Service
public class TechnologyServiceImpl implements TechnologyService {

	@Autowired
	private TechnologyDao dao;
	
	public List<Technology> getAll() {
		
		return this.dao.getAllTech();
	}

	public Technology getById(Integer id) {
		
		return this.dao.getTechById(id);
	}

	public boolean save(Technology tech) {
		
		return this.dao.saveTech(tech);
	}

	public boolean update(Technology tech) {
		
		return this.dao.updateTech(tech);
	}

	public boolean delete(Integer id) {
		
		return this.dao.deleteTech(id);
	}
}
