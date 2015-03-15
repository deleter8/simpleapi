package com.deleter.simpleapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "v1" path)
 */
@Path("v1")
public class RestApi {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	 @GET
	 @Produces(MediaType.TEXT_PLAIN)
	 public String ping() {
		return "Hey!";
	 }
	 
	 @GET
	 @Path("/hello")
	 @Produces(MediaType.APPLICATION_JSON)
	 public Welcome welcome() {
		 Welcome welcome=new Welcome();
		 welcome.setMessage("JSON Example");
		 return welcome;
	 }

    @GET
    @Path("/resource")
    @Produces(MediaType.APPLICATION_JSON)
    public TestResource resource() {
        TestResource resource=new TestResource();
        return resource;
    }

}