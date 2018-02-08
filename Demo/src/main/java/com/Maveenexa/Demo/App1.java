package com.Maveenexa.Demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App1
{
    public static void main( String[] args )
    {
    	Employee1 e=new Employee1();
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Employee1.class);
    	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(sr);
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	e=(Employee1)s.get(Employee1.class,500);
    	//s.save(e);
    	t.commit();
    	System.out.println(e);
    }
}