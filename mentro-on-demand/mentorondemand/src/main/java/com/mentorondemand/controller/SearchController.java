package com.mentorondemand.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mentorondemand.entity.MentorSkill;
import com.mentorondemand.entity.MentorSlot;
import com.mentorondemand.entity.Search;
import com.mentorondemand.entity.SearchList;
import com.mentorondemand.entity.SkillList;
import com.mentorondemand.entity.SlotList;
import com.mentorondemand.entity.Technology;
import com.mentorondemand.entity.StatusResponse;
import com.mentorondemand.entity.User;

@RestController
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private RestTemplate restTemp;
	
	@RequestMapping("/{techId}")
	public SearchList searchById(@PathVariable("techId") Integer techId)
	{
		List<Search> search = new LinkedList<Search>();
		
		SkillList skillList = restTemp.getForObject("http://MENTOR-SKILL/mentorskill/getMentorSkillByTechId/"+techId,SkillList.class);
		
		List<MentorSkill> skills = skillList.getListSkill();
		
		for(MentorSkill skill : skills) {
			
			Technology tech = restTemp.getForObject("http://TECHNOLOGY/technology/getById/"+skill.getTechnologyId(),Technology.class);
			User user = restTemp.getForObject("http://USER/user/getById/"+skill.getMentorId(),User.class);
			SlotList slotList = restTemp.getForObject("http://MENTOR-SLOT/mentorslot/getByMentorId/"+skill.getMentorId(),SlotList.class);
			
			List<MentorSlot> slots = slotList.getListSlot();
			
			for(MentorSlot slot : slots) {
				
				StatusResponse status = restTemp.getForObject("http://TRAINING/training/checkSlot/"+slot.getId(),StatusResponse.class);
				
				if(status.getStatus())
				{
					search.add(new Search(user.getId(),user.getFirstName(),user.getLastName(),user.getYearOfExp(),user.getLinkedInUrl(),tech.getId(),tech.getTechnologyName(),skill.getId(),skill.getToc(),skill.getPrerequisites(),skill.getFee(),slot.getId(),slot.getTimeFrom(),slot.getTimeTo()));
				}
			}
		}
		
		SearchList searchList = new SearchList(search);
		
		return searchList;
	}
}
