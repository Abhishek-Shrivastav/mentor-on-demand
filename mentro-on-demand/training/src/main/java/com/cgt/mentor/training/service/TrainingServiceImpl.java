package com.cgt.mentor.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgt.mentor.training.entity.Training;
import com.cgt.mentor.training.facade.TrainingDao;
import com.cgt.mentor.training.facade.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService {

	@Autowired
	private TrainingDao dao;
	
	public List<Training> getAll() {
		
		return this.dao.getAllTraining();
	}

	public Training getById(Integer id) {
		
		return this.dao.getTrainingById(id);
	}

	public boolean save(Training skill) {
		
		return this.dao.saveTraining(skill);
	}

	public boolean update(Training skill) {
		
		return this.dao.updateTraining(skill);
	}

	public boolean delete(Integer id) {
		
		return this.dao.deleteTraining(id);
	}
}
