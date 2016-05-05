package org.jersey.test.vishnu.books.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class MessageResource {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessages()
	{
		
		return "Hello rest";
	}

}
