package de.wwu.pi;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Simplified client side interface of the web service
 */
@Path("add")
public interface RestAdderClient {

	/**
	 * @param adderRequest {@link AdderRequest} that is being sent to the remote web service as a JSON object
	 * @return {@link AdderResult} that is being returned by the remote web service
	 */
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public AdderResult add(AdderRequest adderRequest);
}
