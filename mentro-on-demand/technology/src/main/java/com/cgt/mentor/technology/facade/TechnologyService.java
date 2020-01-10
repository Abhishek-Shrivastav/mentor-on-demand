package com.cgt.mentor.technology.facade;

import java.util.List;

import com.cgt.mentor.technology.entity.Technology;

public interface TechnologyService {

	List<Technology> getAll();
	Technology getById(Integer id);
	boolean save(Technology tech);
	boolean update(Technology tech);
	boolean delete(Integer id);
}
