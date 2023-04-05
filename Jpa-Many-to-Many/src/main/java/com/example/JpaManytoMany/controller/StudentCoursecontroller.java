package com.example.JpaManytoMany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaManytoMany.entity.Courses;
import com.example.JpaManytoMany.entity.Student;
import com.example.JpaManytoMany.repository.Courserepo;
import com.example.JpaManytoMany.repository.Studentrepository;



@RestController
@RequestMapping("/student/course")
public class StudentCoursecontroller {
  @Autowired
  private Studentrepository studentrepo;


	@PostMapping
	public Student savesStudentWithCourse(@RequestBody Student student) {
		return studentrepo.save(student);
	}
	@GetMapping
	public List<Student> findAllStudents(){
   return studentrepo.findAll();
	}	
	@GetMapping("/{studentid}")
	public Student findStudent(@PathVariable Long studentid) {
		return studentrepo.findById(studentid).orElse(null);
		
	}
	@GetMapping("/find/{name}")
	public List<Student> findStudentByName(@PathVariable String name){
		return studentrepo.findByNameContaining(name);
	}
	
	//@GetMapping("/search/{price}")
	 //public List<Courses> findCourselessthanprice(@PathVariable double price) {
	
	   //return crepo.findlessthanprice(price);
}      //}
