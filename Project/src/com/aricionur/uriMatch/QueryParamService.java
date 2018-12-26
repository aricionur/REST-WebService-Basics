package com.aricionur.uriMatch;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/queryParam")
public class QueryParamService {

	@GET
	@Path("/query")
	public Response doQueryParam(
			@QueryParam("from") int valueOne,
			@QueryParam("to") int valueTwo,
			@QueryParam("orderBy") List<String> stringList) {
		
		String string = "doQueryParam method is called, from : " + valueOne +
				        ", to : " + valueTwo + ", orederBy" + stringList.toString();
		
		return Response.status(200).entity(string).build();
		
	}
	
	@GET
	@Path("/queryProgramatic")
	public Response doProgramatikQuery(@Context UriInfo info ) {
			
			String stringOne = info.getQueryParameters().getFirst("from");
			String stringTwo = info.getQueryParameters().getFirst("to");
			List<String> stringList = info.getQueryParameters().get("orderBy");
		
			String string = "doProgramatikQuery method is called, from : " + stringOne +
							", to : " + stringTwo + ", orederBy" + stringList.toString();
	
			return Response.status(200).entity(string).build();
	
			
	}
	
	@GET
	@Path("/queryWithDefaultValue")
	public Response doQueryWithDefaultValue(
			@DefaultValue("1") @QueryParam("from") int valueOne,
			@DefaultValue("99")@QueryParam("to") int valueTwo,
			@DefaultValue("name") @QueryParam("orderBy") List<String> stringList) {
		
		String string = "doQueryWithDefaultValue method is called, from : " + valueOne +
				        ", to : " + valueTwo + ", orederBy" + stringList.toString();
		
		return Response.status(200).entity(string).build();
		
	}
	
}
