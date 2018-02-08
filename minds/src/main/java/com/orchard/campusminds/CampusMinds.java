package com.orchard.campusminds;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="campusminds")
public class CampusMinds {
	@Id
	@Column(name="minds_id")
	private int minds_id;
	@Column(name="b_id")
	private int b_id;
	@Column(name="lead_id")
	private int lead_id;
	@Column(name="minds_name")
	private String minds_name;
	@Column(name="minds_track")
	private String minds_track;
	@Column(name="minds_email")
	private String minds_email;
	public int getMinds_id() {
		return minds_id;
	}
	public void setMinds_id(int minds_id) {
		this.minds_id = minds_id;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public int getLead_id() {
		return lead_id;
	}
	public void setLead_id(int lead_id) {
		this.lead_id = lead_id;
	}
	public String getMinds_name() {
		return minds_name;
	}
	public void setMinds_name(String minds_name) {
		this.minds_name = minds_name;
	}
	public String getMinds_track() {
		return minds_track;
	}
	public void setMinds_track(String minds_track) {
		this.minds_track = minds_track;
	}
	public String getMinds_email() {
		return minds_email;
	}
	public void setMinds_email(String minds_email) {
		this.minds_email = minds_email;
	}
	
   
}
