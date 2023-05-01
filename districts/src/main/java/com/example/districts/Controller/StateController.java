package com.example.districts.Controller;

import com.example.districts.entity.State;
import com.example.districts.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class StateController{
    @Autowired
    private StateService stateService;
    @GetMapping("/state/district")
    public List<State> getAllDistricts(){
        return stateService.getDistricts();
    }
    @GetMapping("/state/district/{state}")
    public State getDistrictByState(@PathVariable String state){
        return stateService.getDistrictByState(state);
    }
}




