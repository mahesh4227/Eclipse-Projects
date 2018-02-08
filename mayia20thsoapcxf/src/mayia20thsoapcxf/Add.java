package mayia20thsoapcxf;

import javax.jws.WebService;

@WebService(targetNamespace = "http://mayia20thsoapcxf/", portName = "AddPort", serviceName = "AddService")
public class Add {

	
	 public int addition(int a,int b)
	 {
		 return a+b;
	 }
}
