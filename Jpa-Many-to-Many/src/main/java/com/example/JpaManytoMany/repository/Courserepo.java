package com.example.JpaManytoMany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JpaManytoMany.entity.Courses;

public interface Courserepo  extends JpaRepository<Courses,Long> {

	//List<Courses> findlessthanprice(double price);

	

}
