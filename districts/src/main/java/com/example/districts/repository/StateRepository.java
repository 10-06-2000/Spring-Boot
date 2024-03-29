package com.example.districts.repository;

import com.example.districts.entity.State;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StateRepository extends JpaRepository<State,String> {

    State findByState(String state);
}


