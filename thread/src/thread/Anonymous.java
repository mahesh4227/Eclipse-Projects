package thread;

public class Anonymous {

	public static void main(String[] args) {
		 Thread t = new Thread() {

	            public void run() {
	                for (int i = 0; i <10; i++) {
	                    try {
	                        Thread.sleep(1000);
	                        System.out.print(i);
	                    } catch (Exception e) {
	                        e.getMessage();
	                    }
	                }

	            }

	        };

	        t.start();

	    }
	
	}
