package com.orchard.orchardProgram;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orchard")
public class Orchard {
	
	@Id
	@Column(name="orchard_id")
	private int orchard_id;
	@Column(name="orchard_year")
	private int orchard_year;
	public int getOrchard_id() {
		return orchard_id;
	}
	public void setOrchard_id(int orchard_id) {
		this.orchard_id = orchard_id;
	}
	public int getOrchard_year() {
		return orchard_year;
	}
	public void setOrchard_year(int orchard_year) {
		this.orchard_year = orchard_year;
	}
	
}
