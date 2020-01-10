package com.cgt.mentor.skill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgt.mentor.skill.entity.MentorSkill;
import com.cgt.mentor.skill.facade.MentorSkillService;

@RestController
@RequestMapping("/mentorskill")
public class MentorSkillController {

	@Autowired
	private MentorSkillService service;
	
	@RequestMapping("/")
	public String hello()
	{
		return "Hello";
	}
	
	@RequestMapping("/getAllSkill")
	public List<MentorSkill> getAllSkill()
	{
		List<MentorSkill> list = this.service.getAll();
		
		return list;
	}
	
	@RequestMapping("/save")
	public boolean save(@RequestBody MentorSkill skill)
	{
		return this.service.save(skill);
	}
	
	@RequestMapping("/getById/{id}")
	public MentorSkill getSkillById(@PathVariable("id") Integer id)
	{
		MentorSkill skill = this.service.getById(id);
		
		return skill;
	}
	
	@RequestMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") Integer id)
	{
		return this.service.delete(id);
	}
	
	@RequestMapping("/update")
	public boolean update(@RequestBody MentorSkill skill)
	{
		return this.service.update(skill);
	}
}
