package binodsuman.spring_boot_CRUD_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import binodsuman.spring_boot_CRUD_project.dao.StudentDAO;
import binodsuman.spring_boot_CRUD_project.entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDAO dao;
	
	public String addStudent(List<Student> student) {
		dao.saveAll(student);
		return "All New Student has been added into database,roll number :"+student.getRoll();
		}
	
	public String addStudents(List<student> students) {
			dao.saveAll(students);
			return "All new Student has been added into Database";
	}


}