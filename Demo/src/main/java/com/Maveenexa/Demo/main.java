package com.Maveenexa.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class main {
	static SessionFactory sf;
	static Session s;

	public static void main(String[] args) {
		DaoImplementation d=new DaoImplementation();
      DaoImplementation.start();
		d.insert(10);
		d.update(3);
		d.delete(4);
		d.read(3);
		DaoImplementation.close();
   
	}

}
