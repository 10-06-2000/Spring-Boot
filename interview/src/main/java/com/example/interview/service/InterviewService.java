package com.example.interview.service;


import com.example.interview.Repository.InterviewRepo;
import com.example.interview.entity.Interview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewService {

    @Autowired
    public InterviewRepo repo;
    public Interview addInterviewDetails(Interview interview) {
        return repo.save(interview);
    }

    public List<Interview> getAllDetails() {
        return repo.findAll();
    }

    public Interview findDetailsById(int id) {
        return repo.findById(id).orElse(null);
    }
}





