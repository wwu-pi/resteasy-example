package de.wwu.pi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/")
public interface RestAdderClient {

	@GET
	@Produces("application/json")
	public int add(
			@QueryParam("first") int first,
			@QueryParam("second") int second);
}
