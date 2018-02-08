package base_package;

import javax.jws.WebService;

@WebService(targetNamespace = "http://base_package/", portName = "Hello_WorldPort", serviceName = "Hello_WorldService")
public class Hello_World {

	public String getHello(String hey) {
		return "hello = " + hey;
	}

}
