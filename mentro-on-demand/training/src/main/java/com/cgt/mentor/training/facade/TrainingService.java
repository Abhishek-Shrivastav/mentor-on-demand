package com.cgt.mentor.training.facade;

import java.util.List;

import com.cgt.mentor.training.entity.Training;

public interface TrainingService {

	List<Training> getAll();
	Training getById(Integer id);
	boolean save(Training skill);
	boolean update(Training skill);
	boolean delete(Integer id);
}
