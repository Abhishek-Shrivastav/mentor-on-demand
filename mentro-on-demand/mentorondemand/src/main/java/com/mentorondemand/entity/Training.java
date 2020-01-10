package com.mentorondemand.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Training {

	private Integer id;
	private Integer mentorId;
	private Integer userId;
	private Integer slotId;
	private Integer techId;
	private Integer progress;
	private Date startDate;
	private Date endDate;
	private Integer amountReceived;
	private Integer request;
	private Integer isActive;
	
	public Training() {}

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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSlotId() {
		return slotId;
	}

	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}

	public Integer getTechId() {
		return techId;
	}

	public void setTechId(Integer techId) {
		this.techId = techId;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(Integer amountReceived) {
		this.amountReceived = amountReceived;
	}

	public Integer getRequest() {
		return request;
	}

	public void setRequest(Integer request) {
		this.request = request;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Training [id=" + id + ", mentorId=" + mentorId + ", userId=" + userId + ", slotId=" + slotId
				+ ", techId=" + techId + ", progress=" + progress + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", amountReceived=" + amountReceived + ", request=" + request + ", isActive=" + isActive + "]";
	}
}
