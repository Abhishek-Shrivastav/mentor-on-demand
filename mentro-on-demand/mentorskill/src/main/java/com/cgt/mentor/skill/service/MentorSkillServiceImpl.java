package com.cgt.mentor.skill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgt.mentor.skill.entity.MentorSkill;
import com.cgt.mentor.skill.facade.MentorSkillDao;
import com.cgt.mentor.skill.facade.MentorSkillService;

@Service
public class MentorSkillServiceImpl implements MentorSkillService {

	@Autowired
	private MentorSkillDao dao;
	
	@Override
	public List<MentorSkill> getAll() {
		
		return this.dao.getAllSkill();
	}

	@Override
	public MentorSkill getById(Integer id) {
		
		return this.dao.getSkillById(id);
	}

	@Override
	public boolean save(MentorSkill skill) {
		
		return this.dao.saveSkill(skill);
	}

	@Override
	public boolean update(MentorSkill skill) {
		
		return this.dao.updateSkill(skill);
	}

	@Override
	public boolean delete(Integer id) {
		
		return this.dao.deleteSkill(id);
	}
}
