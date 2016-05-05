package org.jersey.test.vishnu.books.pojo;

import java.util.Date;

public class Messanger {
	
	
	
	private long id;
	private String message;
	private Date created;
	private String author;
	
	
	
	
	public Messanger(long id, String message, Date created, String author) {
		super();
		this.id = id;
		this.message = message;
		this.created = created;
		this.author = author;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getMessage() {
		return message;
	}




	public void setMessage(String message) {
		this.message = message;
	}




	public Date getCreated() {
		return created;
	}




	public void setCreated(Date created) {
		this.created = created;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	@Override
	public String toString() {
		return "Messanger [id=" + id + ", message=" + message + ", created="
				+ created + ", author=" + author + "]";
	}
	
	

}
