package com.ricky.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.ricky.service.HelloMessage;

public class HelloMessageClient {
	
	private static final String WS_WSDL_LOCATION ="http://localhost:9999/ws/hello?wsdl";
	private static final String WS_NAMESPACE ="http://service.ricky.com/"; //see wsdl
	private static final String WS_NAME ="HelloMessageImplService";//see wsdl
	
	public static void main(String[] args) throws Exception {
		URL url = new URL(WS_WSDL_LOCATION);
		QName qname = new QName(WS_NAMESPACE,WS_NAME);
		Service service = Service.create(url,qname);
		HelloMessage message = service.getPort(HelloMessage.class);//service endpoint interface is the param
		System.out.println(message.getMessage("ricky"));
	}
}
