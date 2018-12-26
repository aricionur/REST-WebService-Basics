package com.aricionur.uriMatch;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/person")
public class PersonRestService {

	@GET
	public Response doGetPerson() {
		String string = "doGetPerson method is called..";
		return Response.status(200).entity(string).build();
	}
	
	@GET
	@Path("/doGetStudent")
	public Response doGetStudent() {
		String string = "doGetStudent method is called..";
		return Response.status(200).entity(string).build();
	}
	
	@GET
	@Path("{param1}")
	public Response doGetPersonByName(@PathParam("param1") String name) {
		String string = "doGetPersonByName method is calld, name : " + name;
		return Response.status(200).entity(string).build();
	}
	
	@GET
	@Path("/doGetPersonById/{param1 : \\d+}") 
	public Response doGetPersonById(@PathParam("param1") int id) {
		String string = "doGetPersonById method is called, Id : " + id;
		return Response.status(200).entity(string).build();
	}
	
	@GET
	@Path("/doGetPersonByPersonName/{param1 : [a-zA-Z][a-zA-Z_0-9]}") 
	public Response doGetPersonByPersonName(@PathParam("param1") String personName) {
		String string = "doGetPersonByPersonName method is called, person name : " + personName;
		return Response.status(200).entity(string).build();
	}
	

}
