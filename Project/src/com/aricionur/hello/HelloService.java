package com.aricionur.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {

	@GET
	@Path("/doGetHello")
	public Response doGetHello() {
		String hello = "Hello";
		
		//return Response.ok(hello).build();
		return Response.status(200).entity(hello).build();
		
	}

}
