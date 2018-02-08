package last;

import javax.jws.WebService;

@WebService(targetNamespace = "http://last/", portName = "XyzPort", serviceName = "XyzService")
public class Xyz {
	
	public void hello()
	{
		System.out.println("hello Mahesh");
	}

}
