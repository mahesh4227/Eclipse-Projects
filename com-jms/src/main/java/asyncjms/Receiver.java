package asyncjms;

/*import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.QueueSession;
import javax.jms.QueueReceiver;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;

public class Receiver {

	public static void main(String args[]) throws Exception {
		Properties env = new Properties();					   				env.put(Context.INITIAL_CONTEXT_FACTORY,
				"org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		env.put(Context.PROVIDER_URL, "tcp://localhost:61616");
		env.put("queue.queueSampleQueue","MyNewQueue");
		// get the initial context
		InitialContext ctx = new InitialContext(env);

		// lookup the queue object
		Queue queue = (Queue) ctx.lookup("queueSampleQueue");

		// lookup the queue connection factory
		QueueConnectionFactory connFactory = (QueueConnectionFactory) ctx.lookup("QueueConnectionFactory");

		// create a queue connection
		QueueConnection queueConn = connFactory.createQueueConnection();

		// create a queue session
		QueueSession queueSession = queueConn.createQueueSession(false,Session.AUTO_ACKNOWLEDGE);

		// create a queue receiver
		QueueReceiver queueReceiver = queueSession.createReceiver(queue);

		// start the connection
		queueConn.start();

		// receive a message
		TextMessage message = (TextMessage) queueReceiver.receive();

		// print the message
		System.out.println("received: " + message.getText());

		// close the queue connection
		queueConn.close();
	}
}*/



import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.Message;
import javax.jms.TextMessage;
import javax.jms.MessageListener;
import javax.jms.JMSException;
import javax.jms.ExceptionListener;
import javax.jms.QueueSession;
import javax.jms.QueueReceiver;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
                                                                           
public class Receiver implements MessageListener, ExceptionListener
{
    static QueueConnection queueConn = null;
    public static void main(String[] args) throws Exception
    {
    	Properties env = new Properties();
		env.put(Context.INITIAL_CONTEXT_FACTORY,
				"org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		env.put(Context.PROVIDER_URL, "tcp://localhost:61616");
		env.put("queue.queueSampleQueue","MyNewQueue");
		
       InitialContext ctx = new InitialContext(env);
                                                                          
       Queue queue = (Queue) ctx.lookup("queueSampleQueue");
                                                                          
       QueueConnectionFactory connFactory = (QueueConnectionFactory) ctx.lookup("QueueConnectionFactory");
                                                                          
       queueConn = connFactory.createQueueConnection();
                                                                          
       QueueSession queueSession = queueConn.createQueueSession(false,Session.AUTO_ACKNOWLEDGE);
                                                                          
       QueueReceiver queueReceiver = queueSession.createReceiver(queue);
                                                                          
       Receiver Receiver = new Receiver();
       queueReceiver.setMessageListener(Receiver);
                                                                          
       queueConn.setExceptionListener(Receiver);
           queueConn.start();                                                                         
    }
    public void onMessage(Message message)
    {
       TextMessage msg = (TextMessage) message;
       try {
    	   if(msg.getText().equals("exit")){
    		   queueConn.close();
    		   System.out.println("Application Exits");
    	   }else{
    		   System.out.println("received: " + msg.getText());
    	   }
       } catch (JMSException ex) {
          ex.printStackTrace();
       }
    }
                                                                           
    public void onException(JMSException exception)
    {
       System.err.println("an error occurred: " + exception);
    }
}