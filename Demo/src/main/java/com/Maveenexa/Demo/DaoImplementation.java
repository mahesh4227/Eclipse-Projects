package com.Maveenexa.Demo;

import java.util.List;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Maveenexa.connect.Connect;

public class DaoImplementation  {
	private Session session;
	Transaction t;
	public DaoImplementation()
	{
		session=Connect.doconnection();
		t=session.beginTransaction();
	}
	public void select()
	{
		Query query=session.createQuery("from Employee1");
		List<Employee1> list=query.list();
		System.out.println("eid     ename    eage");
		for(Employee1 i:list)
		{
			System.out.println(i.getEid()+"   "+i.getEname()+"  "+i.getEage());
		}
		
	}
	public void insert(int eid, String ename, int eage) throws Exception
	{
		Employee1 emp=new Employee1();
		emp.setEage(eid);
		emp.setEname(ename);
		emp.setEage(eage);
		session.save(emp);
		t.commit();
		System.out.println("Rows Effected");
	}
	
	
	/*static SessionFactory sf;
	static Session s;
	public boolean insert(int n) {
		try
		{
		for(int i=0;i<n;i++)
		{
			Employee2 emp=new Employee2();
			emp.setUname("user"+i);
			emp.setUid(i);
			s.save(emp);
		}
		}catch(Exception e)
		{
			e.getMessage();
		return false;
		}
		return true;
	}
	public boolean delete(int n) {
		try
		{
			Employee2 emp1=(Employee2)s.get(Employee2.class,n);
			s.delete(emp1);
		}catch(Exception e)
		{e.getMessage();
		return false;
		}
		return true;
	}
	public boolean update(int n) {
		try{
			Employee2 emp2=(Employee2)s.get(Employee2.class,n);
			emp2.setUname("updated user");
			s.update(emp2);
		}catch(Exception e)
		{
			e.getMessage();
		return false;
		}
		return true;
	}
	public boolean read(int n) {
		try{
			Employee2 emp3=(Employee2)s.get(Employee2.class,n);
			System.out.println("employee name read is"+" "+emp3.getUname());
		}catch(Exception e)
		{
			e.getMessage();
		return false;
	}
		return true;
	}	public static boolean start()
	{
		try
		{
			String hibernateFilePath="hibernate.cfg.xml";
			sf=new Configuration().configure(hibernateFilePath).buildSessionFactory();
			s=sf.openSession();
			s.beginTransaction();
		}catch(Exception e)
		{
			e.getMessage();
			return false;
		}
		return true;
	}
	public static boolean close()
	{
		try{
			s.getTransaction().commit();
			s.close();
		}catch(Exception e)
		{
			e.getMessage();
			return false;
		}
		return true;
	}*/
	
}
