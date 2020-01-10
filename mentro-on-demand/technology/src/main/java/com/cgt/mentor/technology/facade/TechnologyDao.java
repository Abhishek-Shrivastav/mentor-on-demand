package com.cgt.mentor.technology.facade;

import java.util.List;

import com.cgt.mentor.technology.entity.Technology;

public interface TechnologyDao {

	List<Technology> getAllTech();
	Technology getTechById(Integer id);
	boolean saveTech(Technology tech);
	boolean updateTech(Technology tech);
	boolean deleteTech(Integer id);
}
