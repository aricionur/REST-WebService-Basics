package com.aricionur.downloadPdfFile;
import javax.ws.rs.GET;
import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/pdf")
public class PdfService {

	private static final String FILE_PATH = "D:\\Files\\test.pdf";

	@GET
	@Path("/getPdf")
	@Produces("application/pdf")
	public Response doGetPdf() {

		File file = new File(FILE_PATH);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition","attachment; filename=file_from_server.pdf");
	   
		return response.build();
	}
}
