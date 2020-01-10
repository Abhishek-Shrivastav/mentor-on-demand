package com.cgt.mentor.slot.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentor_slots")
public class MentorSlot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "mentor_id")
	private Integer mentorId;
	@Column(name = "time_from")
	private Time timeFrom;
	@Column(name = "time_to")
	private Time timeTo;
	
	public MentorSlot() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}

	public Time getTimeFrom() {
		return timeFrom;
	}

	public void setTimeFrom(Time timeFrom) {
		this.timeFrom = timeFrom;
	}

	public Time getTimeTo() {
		return timeTo;
	}

	public void setTimeTo(Time timeTo) {
		this.timeTo = timeTo;
	}

	@Override
	public String toString() {
		return "MentorSlot [id=" + id + ", mentorId=" + mentorId + ", timeFrom=" + timeFrom + ", timeTo=" + timeTo
				+ "]";
	}
}
