package com.mentorondemand.entity;

public class MentorSkill {

	private Integer id;
	private Integer mentorId;
	private Integer technologyId;
	private String toc;
	private String prerequisites;
	private Double fee;
	
	public MentorSkill() {}

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

	public Integer getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(Integer technologyId) {
		this.technologyId = technologyId;
	}

	public String getToc() {
		return toc;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "MentorSkill [id=" + id + ", mentorId=" + mentorId + ", technologyId="
				+ technologyId + ", toc=" + toc + ", prerequisites=" + prerequisites + ", fee=" + fee + "]";
	}
}
