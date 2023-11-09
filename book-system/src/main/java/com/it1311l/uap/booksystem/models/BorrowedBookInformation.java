package com.it1311l.uap.booksystem.models;

public class BorrowedBookInformation
{
	private long book_id;
    private String book_code;
    private String book_title; 
    private String book_typeCode;
	
    public long getBook_id() 
    {
		return book_id;
	}
    
	public void setBook_id(long book_id) 
	{
		this.book_id = book_id;
	}
	
	public String getBook_code() 
	{
		return book_code;
	}
	
	public void setBook_code(String book_code) 
	{
		this.book_code = book_code;
	}
	
	public String getBook_title() 
	{
		return book_title;
	}
	
	public void setBook_title(String book_title) 
	{
		this.book_title = book_title;
	}
	
	public String getBook_typeCode() 
	{
		return book_typeCode;
	}
	
	public void setBook_typeCode(String book_typeCode) 
	{
		this.book_typeCode = book_typeCode;
	}  
}
