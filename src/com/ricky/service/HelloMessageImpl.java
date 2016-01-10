package com.ricky.service;

import javax.jws.WebService;

@WebService(endpointInterface="com.ricky.service.HelloMessage")
public class HelloMessageImpl implements HelloMessage {

	@Override
	public String getMessage(String name) {
		return "Hello World JAX-RS "+name;
	}
}
