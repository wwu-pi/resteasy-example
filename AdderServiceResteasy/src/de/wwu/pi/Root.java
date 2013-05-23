package de.wwu.pi;

import java.net.URI;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * Entry point for the web service
 */
@Path("/")
public interface Root {

	/**
	 * Apparently, RESTful web services should allow clients to dynamically
	 * navigate its resources. For that reason an application endpoint should
	 * provide additional information such as possible links. There are
	 * different approaches to this, of which the <a
	 * href="http://jsonapi.org/">JSON API</a> one is implemented by this root
	 * resource.
	 * 
	 * @param uriInfo
	 *            is handed in by RESTEasy and allows among other operations to
	 *            access the base URI of the web service
	 * @return JSON object with links to available operations, see <a
	 *         href="http://jsonapi.org/format/">JSON API</a> for further
	 *         reference.
	 */
	@GET
	@Produces("application/json")
	public Map<String, Map<String, URI>> links(@Context UriInfo uriInfo);

}