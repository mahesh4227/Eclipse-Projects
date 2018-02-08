package com.orchard.leads;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leads")
public class Leads {
	
	@Id
	private int lead_id;
	@Column(name="b_id",nullable=false)
	private int b_id;
	@Column(name="lead_name")
	private String lead_name;
	@Column(name="lead_mail")
	private String lead_mail;
	public int getLead_id() {
		return lead_id;
	}
	public void setLead_id(int lead_id) {
		this.lead_id = lead_id;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getLead_name() {
		return lead_name;
	}
	public void setLead_name(String lead_name) {
		this.lead_name = lead_name;
	}
	public String getLead_mail() {
		return lead_mail;
	}
	public void setLead_mail(String lead_mail) {
		this.lead_mail = lead_mail;
	}
	

}
