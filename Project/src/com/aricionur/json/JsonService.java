package com.aricionur.json;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/json")
public class JsonService {
	
	Gson gson = new Gson(); 
	
	@GET
	@Path("/getPerson/{param1}")
	@Produces(MediaType.APPLICATION_JSON)
	public PersonEntity doGetPerson(@PathParam("param1") int id) {
		
		PersonEntity person = PersonService.getInstance().personList.get(id);
		
		return person;
	}
	
	
	//@PUT
	@POST
	@Path("/addPerson/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response doAddPerson(String jsonInput) {
		PersonEntity person =  gson.fromJson(jsonInput, PersonEntity.class);
		PersonService.getInstance().personList.add(person);
		
		String result = "doAddPerson method is called, added person name : " + person.getName() +
						" surname : " + person.getSurname();
		
		return Response.status(200).entity(result).build();
	}
	
	
}
