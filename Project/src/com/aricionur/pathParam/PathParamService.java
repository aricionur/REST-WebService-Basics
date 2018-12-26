package com.aricionur.pathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/pathParam")
public class PathParamService {

	@GET
	@Path("/{param1}")
	public Response doSinglePathParam(@PathParam("param1") String string) {
		String stringLocal = "doSinglePathParam method is called, parametre : " + string;
		return Response.status(200).entity(stringLocal).build();
		
	}
	
	@GET
	@Path("/{param1}/{param2}/{param3}")
	public Response doMultiplePathParam(
					@PathParam("param1") String s1,
					@PathParam("param2") String s2,
					@PathParam("param3") String s3) {
		String stringLocal = "doMultiplePathParam method is called, parametres : " + 
								s1 + " " +
								s2 + " " + 
								s3;
		
		return Response.status(200).entity(stringLocal).build();
		
	}
	
	
	
}
