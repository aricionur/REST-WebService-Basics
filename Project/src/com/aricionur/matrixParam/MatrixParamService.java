package com.aricionur.matrixParam;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/matrixParam")
public class MatrixParamService {

	@GET
	@Path("{param1}")
	public Response doMatrixParam(
			@PathParam("param1") String name,
			@MatrixParam("param2") String age,
			@MatrixParam("param3") String country) {
	
		String string = "doMatrixParam method is called, name : " + name +
						" age : " + age +
						" country : " + country;
	
		return Response.status(200).entity(string).build();
	}
	
}
