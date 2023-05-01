package com.example.districts.service;


import com.example.districts.entity.State;
import com.example.districts.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {
    @Autowired
    private StateRepository repo;


    public List<State> getDistricts() {
        return repo.findAll();
    }

    public State getDistrictByState(String state) {
        return repo.findByState(state);
    }
}