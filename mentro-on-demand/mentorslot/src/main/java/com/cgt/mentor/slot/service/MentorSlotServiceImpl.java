package com.cgt.mentor.slot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgt.mentor.slot.entity.MentorSlot;
import com.cgt.mentor.slot.facade.MentorSlotDao;
import com.cgt.mentor.slot.facade.MentorSlotService;

@Service
public class MentorSlotServiceImpl implements MentorSlotService {

	@Autowired
	private MentorSlotDao dao;
	
	public List<MentorSlot> getAll() {
		
		return this.dao.getAllSlot();
	}

	public MentorSlot getById(Integer id) {
		
		return this.dao.getSlotById(id);
	}

	public boolean save(MentorSlot slot) {
		
		return this.dao.saveSlot(slot);
	}

	public boolean update(MentorSlot slot) {
		
		return this.dao.updateSlot(slot);
	}

	public boolean delete(Integer id) {
		
		return this.dao.deleteSlot(id);
	}
}
