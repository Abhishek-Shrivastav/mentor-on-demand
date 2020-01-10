package com.cgt.mentor.skill.facade;

import java.util.List;

import com.cgt.mentor.skill.entity.MentorSkill;

public interface MentorSkillService {

	List<MentorSkill> getAll();
	MentorSkill getById(Integer id);
	boolean save(MentorSkill skill);
	boolean update(MentorSkill skill);
	boolean delete(Integer id);
}
