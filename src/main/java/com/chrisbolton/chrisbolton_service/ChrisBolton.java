package com.chrisbolton.chrisbolton_service;

import java.util.Date;

public class ChrisBolton {
	private String author;
	private String title;
	private String content;
	private Date date;
	
	public ChrisBolton(String author, String title, String content, Date date) {
		super();
		this.author = author;
		this.title = title;
		this.content = content;
		this.date = date;
	}

	public String getAuthor(){
		return this.author;
	}

	public String getTitle(){
		return this.title;
	}

	public String getContent(){
		return this.content;
	}

	public Date getDate(){
		return this.date;
	}
}
