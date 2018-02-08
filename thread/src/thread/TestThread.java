package thread;
class Demo implements Runnable {
	   private String name;
	   
	    Demo( String name) {
	      this.name = name;
	      Thread t=new Thread(this);
	      t.start();
	   }	   
	   public void run() {
	    	  String  reverse="";
	    	  int length=name.length();
	    	  try
	    	  {
	    	  for ( int i = length - 1 ; i >= 0 ; i-- )
	    		           reverse = reverse + name.charAt(i);
	    		   
	    		      if (name.equals(reverse))
	    		      {
	    		         System.out.println(name+"  "+"is a palindrome.");
	    		      }
	    		     else
	    		     {
	    		          System.out.println(name+"  "+ " is not a palindrome.");
	    		     }
	    		      }
	    		      catch(Exception e)
	    		      {
	    		    	  System.out.println(e.getMessage());
	    		      }
	         }	   
}
	public class TestThread {
	   public static void main(String args[]) {
	      Demo d1 = new Demo( "yey");
	      Demo d2 = new Demo("mahia");
	      Demo d3=new Demo("hello");
	   }   
	}