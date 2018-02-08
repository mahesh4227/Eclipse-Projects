package com;

import javax.jws.WebService;

@WebService(targetNamespace = "http://com/", portName = "AddPort", serviceName = "AddService")
public class Add {
	
	public int add()
	{
		int a=5;
		int b=7;
		return a+b;
	}

}
