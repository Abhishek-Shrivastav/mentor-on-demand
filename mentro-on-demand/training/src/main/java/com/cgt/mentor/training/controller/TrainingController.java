package com.cgt.mentor.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgt.mentor.training.entity.Training;
import com.cgt.mentor.training.facade.TrainingService;

@RestController
@RequestMapping("/training")
public class TrainingController {

	@Autowired
	private TrainingService service;
	
	@RequestMapping("/getAllTraining")
	public List<Training> getAllTraining()
	{
		List<Training> list = this.service.getAll();
		
		return list;
	}
	
	@RequestMapping("/save")
	public boolean save(@RequestBody Training skill)
	{
		return this.service.save(skill);
	}
	
	@RequestMapping("/getById/{id}")
	public Training getTraininglById(@PathVariable("id") Integer id)
	{
		Training skill = this.service.getById(id);
		
		return skill;
	}
	
	@RequestMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") Integer id)
	{
		return this.service.delete(id);
	}
	
	@RequestMapping("/update")
	public boolean update(@RequestBody Training skill)
	{
		return this.service.update(skill);
	}
}
