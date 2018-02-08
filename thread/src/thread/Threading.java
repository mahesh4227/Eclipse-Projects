package thread;
import java.util.*;

class ThreadExample implements Runnable
{
	ThreadExample() throws InterruptedException
	{
		Thread t1=new Thread(this);
		t1.setName("mahesh");
		Thread t2=new Thread(this);
		t2.setName("kiran");
		Thread t3=new Thread(this);
		t3.setName("anand");
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		t3.start();
	}
	 public void run() {
		try
		{
			System.out.println(Thread.currentThread().getName()+" "+"is studying");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" "+"is watching");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" "+"is playing");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}

public class Threading {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadExample d1=new ThreadExample();
		
	}

}
