package thread;
 class Even implements Runnable {
		   private int num;
		   private Thread t;
		   
		    Even(int num) {
		      this.num = num;
		   }	   
		   public void run() {
		    	  if(num%2==0)
		    	  {
		    		  System.out.println(num+"  "+ "is an even number");
		    	  }
		    	  else
		    	  {
		    		  System.out.println(num+"  "+"is an odd number");
		    	  }
		         }	
		   public void start () {
		       t = new Thread (this);
		         t.start ();
		   }
	}
		public class EvenOdd {

		   public static void main(String args[]) {
		      Even e1 = new Even(15);
		      e1.start();
		      Even e2 = new Even(122);
		      e2.start();
		      Even e3= new Even(27);
		      e3.start();
		      
		      Even e4 = new Even(20);
		      e4.start();
		   }   
		}
