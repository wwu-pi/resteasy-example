package de.wwu.pi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/")
public class AdderResource {

	@GET
	@Produces("application/json")
	public int addTwoNumbers(
			@QueryParam("first") int first,
			@QueryParam("second") int second) {
		return first + second;
	}

}