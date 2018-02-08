package com.Maveenexa.Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;
import org.hibernate.annotations.Tables;

@Entity(name="emptable")
public class Employee1 {
	@Id
	private int eid;
	private String ename;
	private int eage;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", ename=" + ename + ", eage=" + eage + "]";
	}

}
