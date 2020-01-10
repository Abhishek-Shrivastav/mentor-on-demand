package com.cgt.mentor.skill.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cgt.mentor.skill.entity.MentorSkill;
import com.cgt.mentor.skill.facade.MentorSkillDao;

@Repository
@Transactional
public class MentorSkillDaoImpl implements MentorSkillDao {

	@PersistenceContext
	private EntityManager entity;
	
	@Override
	public List<MentorSkill> getAllSkill() {
		
		List<MentorSkill> mentorSkill = this.entity.createQuery("From MentorSkill").getResultList();
		
		return mentorSkill;
	}

	@Override
	public MentorSkill getSkillById(Integer id) {
		
		MentorSkill skill = this.entity.find(MentorSkill.class,id);
		
		return skill;
	}

	@Override
	public boolean saveSkill(MentorSkill skill) {
		
		this.entity.persist(skill);
		
		return true;
	}

	@Override
	public boolean updateSkill(MentorSkill skill) {
		
		MentorSkill mentorSkill = this.entity.find(MentorSkill.class,skill.getId());
		
		mentorSkill.setMentorId(skill.getMentorId());
		mentorSkill.setTechnologyId(skill.getTechnologyId());
		mentorSkill.setToc(skill.getToc());
		mentorSkill.setPrerequisites(skill.getPrerequisites());
		mentorSkill.setFee(skill.getFee());
		
		this.entity.flush();
		
		return true;
	}

	@Override
	public boolean deleteSkill(Integer id) {
		
		MentorSkill skill = this.entity.find(MentorSkill.class,id);
		this.entity.remove(skill);
		
		return true;
	}
}
