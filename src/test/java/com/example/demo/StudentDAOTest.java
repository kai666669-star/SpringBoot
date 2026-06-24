package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.StudentDAO;
import com.example.demo.model.Students;

import lombok.RequiredArgsConstructor;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional // @Transactional 寫在測試，測完之後會 ROLLBACK
//@Commit  // 若真的要進資料庫，要寫@Commit ，看情況寫
public class StudentDAOTest {

	private StudentDAO studentDAO;

	@Autowired
	public StudentDAOTest(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	// 測試時，若要用建構子注入，要使用 @Autowired
	@Test
	public void insertStudentTest() {
		Integer row = studentDAO.insertStudent("阿文", 166, "wenn@gmail.com");

		assertThat(row).isEqualTo(1);
	}

	@Test
	public void testSelectTop100() {
		studentDAO.insertStudent("Tom", 170, "tom@gmail.com");
		studentDAO.insertStudent("Mary", 170, "mary@gmail.com");

		List<Students> resultList = studentDAO.findTop100();

		ArrayList<String> nameList = new ArrayList<>();

		for (Students oneStudent : resultList) {
			nameList.add(oneStudent.getStudentName());
		}
		assertThat(nameList).contains("Tom", "Mary");
	}

	@Test
	public void testSelectNameAndEmail() {
		studentDAO.insertStudent("Jerry", 170, "jerry@gmail.com");

		List<Students> resultList = studentDAO.findByNameAndEamil("Jerry", "jerry@gmail.com");

		ArrayList<String> nameList = new ArrayList<>();
		for (Students oneStudent : resultList) {
			nameList.add(oneStudent.getStudentName());
		}

		ArrayList<String> emailList = new ArrayList<>();
		for (Students oneStudent : resultList) {
			emailList.add(oneStudent.getEmail());
		}

		assertThat(nameList).contains("Jerry");
		assertThat(emailList).contains("jerry@gmail.com");
	}

}
