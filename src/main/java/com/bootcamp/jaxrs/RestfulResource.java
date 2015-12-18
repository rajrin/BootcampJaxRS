package com.bootcamp.jaxrs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * This is the template for creating a RESTful resource
 */

@Path("/")
public class RestfulResource {

	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("simple")
	public	String	simple(){
		return "simple";
	}
	
	@GET
	@Path("poster")
	public String post(@QueryParam("msg") String msg){
		return "Get Query="+msg;
	}
	
	@GET
	@Path("poster/{id}")
	public String path(@PathParam ("id") int  id){
		return "Get Path="+id;
	}
	
	@POST
	@Path("jsimple")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response jsimple(SimpleBean bean){
		// Change the Fname & Lname to uppercase
		bean.setFname(bean.getFname().toUpperCase());
		bean.setLname(bean.getLname().toUpperCase());
		
		return Response.ok(bean).build();
	}
}
