package com.ricky.endpoint;

import javax.xml.ws.Endpoint;

import com.ricky.service.HelloMessageImpl;

//run this file to publish the web service
//verify by calling http://localhost:9999/ws/hello?wsdl
public class HelloMessagePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloMessageImpl());
	}
}
