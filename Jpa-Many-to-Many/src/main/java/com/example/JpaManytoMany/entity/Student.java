/**
 * 
 */
package com.example.JpaManytoMany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name="STUDENT_TBL")
public class Student {
	
	public Student(long id, String name, int age, String dept, Set<Courses> course) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.course = course;
	}
     public Student() {
     
     }
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int age;
	private String dept;
	
	@ManyToMany(fetch= FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name="STUDENT_COURSE_TABLE",
	joinColumns= {
			
			@JoinColumn(name="Student_id",referencedColumnName="id")
			
	},
	inverseJoinColumns= {
			@JoinColumn(name="course_id",referencedColumnName="id")
	})
@JsonBackReference
private Set<Courses> course;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Set<Courses> getCourse() {
		return course;
	}

	public void setCourse(Set<Courses> course) {
		this.course = course;
	}
	
}

	
	
	
	


