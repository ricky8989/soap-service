package com.ricky.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


//service endpoint
//similar example is on: http://www.mkyong.com/webservices/jax-ws/jax-ws-hello-world-example/

@WebService
@SOAPBinding(style=Style.RPC)
public interface HelloMessage {
	
	@WebMethod
	public String getMessage(String name);

}
