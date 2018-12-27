package com.aricionur.spring;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/spring")
public class SpringService {

	@Autowired
	RepositoryInterface repositoryInterface;
	
	@GET
	@Path("/save")
	public Response doSave() {
		String result = repositoryInterface.doSave();
		
		return Response.status(200).entity(result).build();
	}
}