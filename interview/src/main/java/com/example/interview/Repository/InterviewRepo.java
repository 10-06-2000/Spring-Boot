package com.example.interview.Repository;

import com.example.interview.entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InterviewRepo extends JpaRepository<Interview,Integer> {

}



