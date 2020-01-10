package com.cgt.mentor.slot.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cgt.mentor.slot.entity.MentorSlot;
import com.cgt.mentor.slot.facade.MentorSlotDao;

@Repository
@Transactional
public class MentorSlotDaoImpl implements MentorSlotDao {

	@Autowired
	private EntityManager entity;
	
	public List<MentorSlot> getAllSlot() {
		
		List<MentorSlot> list = this.entity.createQuery("From MentorSlot").getResultList();
		
		return list;
	}

	public MentorSlot getSlotById(Integer id) {
		
		MentorSlot slot = this.entity.find(MentorSlot.class,id);
		
		return slot;
	}

	public boolean saveSlot(MentorSlot slot) {
		
		this.entity.persist(slot);
		
		return true;
	}

	public boolean updateSlot(MentorSlot slot) {
		
		MentorSlot s = this.entity.find(MentorSlot.class,slot.getId());
		
		s.setMentorId(slot.getMentorId());
		s.setTimeFrom(slot.getTimeFrom());
		s.setTimeTo(slot.getTimeTo());
		
		this.entity.flush();
		
		return true;
	}

	public boolean deleteSlot(Integer id) {

		MentorSlot slot = this.entity.find(MentorSlot.class,id);
		this.entity.remove(slot);
		
		return true;
	}
}