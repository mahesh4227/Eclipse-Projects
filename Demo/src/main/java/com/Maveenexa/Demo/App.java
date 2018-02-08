package com.Maveenexa.Demo;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	Scanner scan=new Scanner(System.in);
    	DaoImplementation d=new DaoImplementation();
    	Employee1 e=new Employee1();
    	Configuration con=new Configuration().configure().addAnnotatedClass(Employee1.class);
    	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(sr);
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    		System.out.println("enter employee id");
    		int m=scan.nextInt();
    	    e.setEid(m);
    	    System.out.println("enter employee name");
    	    String o=scan.next();
    	    e.setEname(o);
    	    System.out.println("enter employee age");
    	    int a=scan.nextInt();
    	    e.setEage(a);
    	    s.save(e);
    	    t.commit();
    	
    	//d.select();
    	//d.insert(155,"xyz",23);
    	/*Configuration con=new Configuration().configure().addAnnotatedClass(Employee1.class);
    	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(sr);
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	s.save(e);
    	t.commit();
    	//System.out.println(e);*/
    }
}