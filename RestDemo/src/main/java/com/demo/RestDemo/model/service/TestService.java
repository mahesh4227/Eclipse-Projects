package com.demo.RestDemo.model.service;

import java.util.ArrayList;
import java.util.List;
import com.demo.RestDemo.model.*;
import com.google.gson.JsonElement;

public class TestService {
	
	public static List<Test> getIt()
	{
		Test t1=new Test(1,"mahesh",70);
		Test t2=new Test(2,"kiran",75);
		Test t3=new Test(3,"anand",71);
		Test t4=new Test(4,"mahi",85);
		Test t5=new Test(5,"xyz",66);
		List<Test> list=new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		return list;
		
	}

   public static String postIt() {
		
		return "Post Successfull...";
	}

}
