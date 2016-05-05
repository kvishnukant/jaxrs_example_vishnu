package org.jersey.test.vishnu.books.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.jersey.test.vishnu.books.pojo.BookPojo;

@Path("/booksdetail")
public class BookController {

	@GET
	//@Produces(MediaType.TEXT_XML)
	@Produces(MediaType.TEXT_XML)
	@Path("/instring")
	public String getName()
	{
		BookPojo bookpojo=new BookPojo(10, "java", "author");
		
		//return Response.status(200).type(MediaType.TEXT_XML).entity(bookpojo).build();
		return bookpojo.toString();
	}
	
	
	@GET
	//@Produces(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/inobject")
	public BookPojo getNameObject()
	{
		BookPojo bookpojo=new BookPojo(10, "java", "author");
		//Response.ResponseBuilder res= Response.status(Status.OK);
		//res.entity(bookpojo);
		//return Response.status(200).type(MediaType.TEXT_XML).entity(bookpojo).build();
		return bookpojo;
	}
	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/bookpojo")
	public String getBookInstance(BookPojo bookpojo)
	{
		
		System.out.println(bookpojo.toString());
		return "success";
	}
}
