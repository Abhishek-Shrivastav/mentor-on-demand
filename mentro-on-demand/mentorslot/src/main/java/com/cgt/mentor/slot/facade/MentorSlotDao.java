package com.cgt.mentor.slot.facade;

import java.util.List;

import com.cgt.mentor.slot.entity.MentorSlot;

public interface MentorSlotDao {

	List<MentorSlot> getAllSlot();
	MentorSlot getSlotById(Integer id);
	boolean saveSlot(MentorSlot slot);
	boolean updateSlot(MentorSlot slot);
	boolean deleteSlot(Integer id);
}
