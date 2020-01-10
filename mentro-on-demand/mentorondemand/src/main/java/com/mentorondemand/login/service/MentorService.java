package com.mentorondemand.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mentorondemand.entity.MentorSkill;
import com.mentorondemand.entity.MentorSlot;
import com.mentorondemand.entity.SkillList;
import com.mentorondemand.entity.SlotList;
import com.mentorondemand.entity.StatusResponse;
import com.mentorondemand.entity.TrainingList;

@Service
public class MentorService {

	@Autowired
	private RestTemplate restTemp;
	
	/*Mentor Skill Section*/
	
	public SkillList getAllMentorSkill(Integer id)
	{
		SkillList list = restTemp.getForObject("http://MENTOR-SKILL/mentorskill/getMentorSkillById/"+id,SkillList.class);
		
		return list;
	}
	
	public MentorSkill getSkillId(Integer id)
	{
		MentorSkill skill = restTemp.getForObject("http://MENTOR-SKILL/mentorskill/getById/"+id,MentorSkill.class);
		
		return skill;
	}
	
	public StatusResponse saveMentorSkill(MentorSkill mentorSkill)
	{
		StatusResponse status = restTemp.postForObject("http://MENTOR-SKILL/mentorskill/save",mentorSkill,StatusResponse.class);
		
		return status;
	}
	
	public StatusResponse updateMentorSkill(MentorSkill mentorSkill)
	{
		StatusResponse status = restTemp.postForObject("http://MENTOR-SKILL/mentorskill/update",mentorSkill,StatusResponse.class);
		return status;
	}
	
	public StatusResponse deleteMentorSkill(Integer id)
	{
		StatusResponse status = restTemp.getForObject("http://MENTOR-SKILL/mentorskill/delete/"+id,StatusResponse.class);
		
		return status;
	}
	
	/*Mentor Slot Section*/
	
	public SlotList getAllMentorSlot(Integer id)
	{
		SlotList list = restTemp.getForObject("http://MENTOR-SLOT/mentorslot/getByMentorId/"+id,SlotList.class);
		
		return list;
	}
	
	public MentorSlot getSlotId(Integer id)
	{
		MentorSlot slot = restTemp.getForObject("http://MENTOR-SLOT/mentorslot/getById/"+id,MentorSlot.class);
		
		return slot;
	}
	
	public StatusResponse saveMentorSlot(MentorSlot mentorSlot)
	{
		StatusResponse status = restTemp.postForObject("http://MENTOR-SLOT/mentorslot/save",mentorSlot,StatusResponse.class);
		
		return status;
	}
	
	public StatusResponse updateMentorSlot(MentorSlot mentorSlot)
	{
		StatusResponse status = restTemp.postForObject("http://MENTOR-SLOT/mentorslot/update",mentorSlot,StatusResponse.class);
		
		return status;
	}
	
	public StatusResponse deleteMentorSlot(Integer id)
	{
		StatusResponse status = restTemp.getForObject("http://MENTOR-SLOT/mentorslot/delete/"+id,StatusResponse.class);
		
		//StatusResponse status = new StatusResponse(false);
		return status;
	}
	
	/*Training Section*/
	
	public TrainingList getAllTraining()
	{
		TrainingList trainingList = restTemp.getForObject("http://TRAINING/training/getAllTraining",TrainingList.class);
		
		return trainingList;
	}
	
	public TrainingList getActionTraining(Integer actionId)
	{
		TrainingList trainingList = restTemp.getForObject("http://TRAINING/training/getActionTraining/"+actionId,TrainingList.class);
		
		return trainingList;
	}
	
	/*Mentor Request Answer Section*/
	
	public StatusResponse userRequest(Integer trainingId,Integer id)
	{
		StatusResponse status = restTemp.getForObject("http://TRAINING/training/userRequest/"+trainingId+"/"+id,StatusResponse.class);
		
		return status;
	}
}
