package com.cgt.mentor.slot.facade;

import java.util.List;

import com.cgt.mentor.slot.entity.MentorSlot;

public interface MentorSlotService {

	List<MentorSlot> getAll();
	MentorSlot getById(Integer id);
	boolean save(MentorSlot slot);
	boolean update(MentorSlot slot);
	boolean delete(Integer id);
}
