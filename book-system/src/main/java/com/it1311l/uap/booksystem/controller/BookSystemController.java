package com.it1311l.uap.booksystem.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it1311l.uap.booksystem.models.BorrowedBookInformation;
import com.it1311l.uap.booksystem.models.BorrowerInformation;
import com.it1311l.uap.booksystem.repository.BorrowedBookInformationMyBatisRepository;
import com.it1311l.uap.booksystem.repository.BorrowerInformationMyBatisRepository;

@RestController
public class BookSystemController 
{
	@Autowired
    private BorrowerInformationMyBatisRepository studentAccess;

    @Autowired
    private BorrowedBookInformationMyBatisRepository bookAccess;

    @PostMapping("/borrow")
    public Map<String, Object> borrowBooks(@RequestBody BorrowerInformation student) {
        studentAccess.insertStudent(student);

        List<BorrowedBookInformation> books = student.getBook_list();
        for (BorrowedBookInformation book : books) {
            bookAccess.insertBook(book);
        }

        Collections.sort(books, Comparator.comparing(BorrowedBookInformation::getBook_title));

        Map<String, Object> response = new HashMap<>();
        response.put("studentInformation", student);
        response.put("bookCount", books.size());
        response.put("sortedBooks", books);

        return response;
    }


    @GetMapping("/books/{book_typeCode}")
    public List<BorrowedBookInformation> getBooksByType(@PathVariable String book_typeCode) 
    {
        return bookAccess.selectBooksByType(book_typeCode);
    }
}
