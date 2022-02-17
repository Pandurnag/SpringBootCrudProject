package binodsuman.spring_boot_CRUD_project.controller;

import org.hibernate.secure.spi.JaccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import binodsuman.spring_boot_CRUD_project.entity.Student;

@RestController
public class StudentControlller {

	
	@Autowired
	private JaccService studentservice;
	
	@PostMapping("/add")
	public void addStudent(@RequestBody Student student) {
	return studentservice.addStudent(student);
	}
	@PostMapping("/bulkAdd")
	public void addStudent1(@RequestBody Student student) {
	return studentservice.addStudent(student);
}
	@DeleteMapping("/all/{roll}")
	public Object deleteStudent(@PathVariable int roll) {
	StudentControlller studentService;
	return studentService.deleteStudent(roll);
}
	@PutMapping("/add")
	public void updateStudent(@RequestBody Student student) {
	Object studentService;
	return studentService.UpdateStudent(student);
}
	
	
