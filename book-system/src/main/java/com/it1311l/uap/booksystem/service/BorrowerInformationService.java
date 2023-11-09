package com.it1311l.uap.booksystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it1311l.uap.booksystem.models.BorrowerInformation;
import com.it1311l.uap.booksystem.repository.BorrowerInformationMyBatisRepository;

@Service
public class BorrowerInformationService 
{
	@Autowired
    private BorrowerInformationMyBatisRepository studentAccess;

    public void addStudent(BorrowerInformation student) {
    	studentAccess.insertStudent(student);
    }

    public BorrowerInformation getStudentById(long id) {
        return studentAccess.selectStudentById(id);
    }

    public List<BorrowerInformation> getAllStudents() {
        return studentAccess.selectAllStudents();
    }
}
