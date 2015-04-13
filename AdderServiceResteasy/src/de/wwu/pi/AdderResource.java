package de.wwu.pi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Interface for adder resource
 */
@Path("add")
public interface AdderResource {

	/**
	 * Redirects a client which invokes GET on the resources to a resource with
	 * sample data
	 * 
	 * @return Redirection response
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response redirectToSampleData();

	/**
	 * Adds two numbers that are transmitted as a JSON object within the request
	 * body and returns a response that contains the result
	 * 
	 * @param adderRequest {@link AdderRequest} object that is deserialised from the provided JSON object
	 * @return {@link AdderResult} JSON object
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addTwoNumbers(AdderRequest adderRequest);

	/**
	 * Adds two numbers that are transmitted as part of the path template
	 * 
	 * @param first
	 * @param second
	 * @return {@link AdderResult} JSON object
	 */
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("{first}/{second}")
	public AdderResult addTwoNumbers(
			@PathParam("first") int first,
			@PathParam("second") int second);

}