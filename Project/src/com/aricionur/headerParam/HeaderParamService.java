package com.aricionur.headerParam;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

@Path("/headerParam")
public class HeaderParamService {

	@GET
	@Path("/addPerson")
	public Response doAddPerson(
			@HeaderParam("user-agent") String string) {
	
		String stringLocal = "doAddPerson method is called,  user-agent value : " + string;
		
		return Response.status(200).entity(stringLocal).build();
	}
	
	@GET
	@Path("/addPerson_2")
	public Response doAddPersonTwo(@Context HttpHeaders headers) {
		
		String userAgent = headers.getRequestHeader("user-agent").get(0);
		String stringLocal = "doAddPersonTwo method is called,  user-agent value : " + userAgent;
		
		return Response.status(200).entity(stringLocal).build();
	} 
}
