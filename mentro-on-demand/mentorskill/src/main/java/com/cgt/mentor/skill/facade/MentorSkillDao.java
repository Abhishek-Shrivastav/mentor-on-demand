package com.cgt.mentor.skill.facade;

import java.util.List;

import com.cgt.mentor.skill.entity.MentorSkill;

public interface MentorSkillDao {

	List<MentorSkill> getAllSkill();
	MentorSkill getSkillById(Integer id);
	boolean saveSkill(MentorSkill skill);
	boolean updateSkill(MentorSkill skill);
	boolean deleteSkill(Integer id);
}
