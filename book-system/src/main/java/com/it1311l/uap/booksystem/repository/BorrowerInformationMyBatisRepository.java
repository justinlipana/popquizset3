package com.it1311l.uap.booksystem.repository;

import com.it1311l.uap.booksystem.models.BorrowerInformation;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import org.apache.ibatis.annotations.Insert;

@Mapper
public interface BorrowerInformationMyBatisRepository 
{
	@Insert("INSERT INTO borrower_info (student_number, student_name) VALUES (#{student_number}, #{student_name})")
    void insertStudent(BorrowerInformation student);
	BorrowerInformation selectStudentById(long id);
    List<BorrowerInformation> selectAllStudents();
}
