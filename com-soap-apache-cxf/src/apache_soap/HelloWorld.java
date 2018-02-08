package apache_soap;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://apache_soap/", portName = "HelloWorldPort", serviceName = "HelloWorldService")
public class HelloWorld {
	
	public void getHelloWorld() {
		System.out.println("hello world");
	}
	
}
