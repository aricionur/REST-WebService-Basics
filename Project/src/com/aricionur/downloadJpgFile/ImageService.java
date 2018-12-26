package com.aricionur.downloadJpgFile;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/image")
public class ImageService {

	private static final String FILE_PATH = "D:\\Files\\koala.jpg";

	@GET
	@Path("/getImage")
	@Produces("image/jpg")
	public Response doGetImage() {

		File file = new File(FILE_PATH);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=image_from_server.jpg");

		return response.build();
	}
}
