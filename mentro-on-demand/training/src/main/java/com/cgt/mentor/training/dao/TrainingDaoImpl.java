package com.cgt.mentor.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cgt.mentor.training.entity.Training;
import com.cgt.mentor.training.facade.TrainingDao;

@Repository
@Transactional
public class TrainingDaoImpl implements TrainingDao {

	@PersistenceContext
	private EntityManager entity;
	
	public List<Training> getAllTraining() {
		
		List<Training> list = this.entity.createQuery("From Training").getResultList();
		
		return list;
	}

	public Training getTrainingById(Integer id) {
		
		Training training = this.entity.find(Training.class,id);
		
		return training;
	}

	public boolean saveTraining(Training skill) {
		
		this.entity.persist(skill);
		
		return true;
	}

	public boolean updateTraining(Training skill) {
		
		Training training = this.entity.find(Training.class,skill.getId());
		
		training.setMentorId(skill.getMentorId());
		training.setUserId(skill.getUserId());
		training.setSlotId(skill.getSlotId());
		training.setTechId(skill.getTechId());
		training.setProgress(skill.getProgress());
		training.setStartDate(skill.getStartDate());
		training.setEndDate(skill.getEndDate());
		training.setAmountReceived(skill.getAmountReceived());
		training.setRequest(skill.getRequest());
		training.setIsActive(skill.getIsActive());
		
		this.entity.flush();
		
		return true;
	}

	public boolean deleteTraining(Integer id) {
		
		Training training = this.entity.find(Training.class,id);
		this.entity.remove(training);
		
		return true;
	}
}
