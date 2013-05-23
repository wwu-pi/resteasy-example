package de.wwu.pi;

import java.net.URI;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("/")
public interface Root {

	@GET
	@Produces("application/json")
	public Map<String, Map<String, URI>> get(@Context UriInfo uriInfo);

}