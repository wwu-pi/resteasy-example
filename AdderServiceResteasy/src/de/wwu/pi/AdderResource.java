package de.wwu.pi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("add")
public interface AdderResource {

	@GET
	@Produces("application/json")
	public Response redirectToSampleData();

	@POST
	@Consumes("application/json")
	public Response addTwoNumbers(AdderRequest adderRequest);

	@GET
	@Produces({ "application/json", "application/xml" })
	@Path("{first}/{second}")
	public AdderResult addTwoNumbers(
			@PathParam("first") int first,
			@PathParam("second") int second);

}