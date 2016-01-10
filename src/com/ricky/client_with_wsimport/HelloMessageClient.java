package com.ricky.client_with_wsimport;

//wsimport -keep http://localhost:9999/ws/hello?wsdl -p com.ricky.client_with_wsimport
public class HelloMessageClient {

	public static void main(String[] args) {
		HelloMessageImplService service = new HelloMessageImplService();
		HelloMessage message = service.getHelloMessageImplPort();
		System.out.println(message.getMessage("ricky"));
	}

}
