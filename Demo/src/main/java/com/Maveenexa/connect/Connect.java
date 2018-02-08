package com.Maveenexa.connect;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Connect {
	static Session session;
	public static Session doconnection()
	{
		session=new Configuration().configure().buildSessionFactory().openSession();
		return session;
	}
	public static void close() throws Exception
	{
		if(session!=null)
			session.close();
		System.out.println("Exit");
		System.exit(0);
	}

}
