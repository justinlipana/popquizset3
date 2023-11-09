package com.it1311l.uap.booksystem.service;

import com.it1311l.uap.booksystem.models.BorrowedBookInformation;
import com.it1311l.uap.booksystem.repository.BorrowedBookInformationMyBatisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BorrowedBookInformationService 
{
	   @Autowired
	   private BorrowedBookInformationMyBatisRepository bookAccess;

	   public void addBook(BorrowedBookInformation book) 
	   {
		   bookAccess.insertBook(book);
	   }

	   public List<BorrowedBookInformation> getBooksByType(String book_typeCode) 
	   {
	       return bookAccess.selectBooksByType(book_typeCode);
	   }

	   public List<BorrowedBookInformation> getAllBooks() 
	   {
	        return bookAccess.selectAllBooks();
	   }
}
