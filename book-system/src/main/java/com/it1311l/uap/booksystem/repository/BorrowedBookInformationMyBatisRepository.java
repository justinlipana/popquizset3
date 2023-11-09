package com.it1311l.uap.booksystem.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.it1311l.uap.booksystem.models.BorrowedBookInformation;

@Mapper
public interface BorrowedBookInformationMyBatisRepository 
{
	@Insert("INSERT INTO borrowed_books (book_code, book_title, book_typeCode) VALUES (#{book_code}, #{book_title}, #{book_typeCode})")
    void insertBook(BorrowedBookInformation book);
    List<BorrowedBookInformation> selectBooksByType(String book_typeCode);
    List<BorrowedBookInformation> selectAllBooks();
}
