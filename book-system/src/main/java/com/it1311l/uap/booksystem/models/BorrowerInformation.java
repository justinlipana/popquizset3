package com.it1311l.uap.booksystem.models;

import java.util.List;

public class BorrowerInformation 
{
	private int student_id;
	private String student_number;
    private String student_name;
    private List<BorrowedBookInformation> book_list;
	
    public int getStudent_id() 
    {
		return student_id;
	}
    
	public void setStudent_id(int student_id) 
	{
		this.student_id = student_id;
	}
	
	public String getStudent_number() 
	{
		return student_number;
	}
	
	public void setStudent_number(String student_number) 
	{
		this.student_number = student_number;
	}
	
	public String getStudent_name() 
	{
		return student_name;
	}
	
	public void setStudent_name(String student_name) 
	{
		this.student_name = student_name;
	}
	
	public List<BorrowedBookInformation> getBook_list() 
	{
		return book_list;
	}
	
	public void setBook_list(List<BorrowedBookInformation> book_list) 
	{
		this.book_list = book_list;
	}  
}
