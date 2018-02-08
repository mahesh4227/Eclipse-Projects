package com.demo.RestDemo.model;

import javax.xml.bind.annotation.XmlRootElement;


public class Test {
	private int rollnum;
	private String name;
	private int marks;
	
	public Test()
	{
		
	}

	public Test(int rollnum, String name, int marks) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.marks = marks;
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
