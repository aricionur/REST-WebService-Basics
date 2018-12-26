package com.aricionur.formParam;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/formParam")
public class FormParamService {

	@POST
	@Path("/addPerson")
	public Response doAddPerson(
			@FormParam("param1") String name,
			@FormParam("param2") int age ) {
		
		String  string = "doAddPerson method is called, name : " + name +
						 " age : " + age;
		
		return Response.status(200).entity(string).build();
				
		
	}
	
}
