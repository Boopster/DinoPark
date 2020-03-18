package com.personal.example.dinopark.controllers;

import com.personal.example.dinopark.models.Park;
import com.personal.example.dinopark.repositories.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/parks")
public class ParkController {

    @Autowired
    ParkRepository parkRepository;

    @GetMapping("{id}")
    public Optional<Park> getGame(@PathVariable Long Id) {
        return parkRepository.findById(Id);
    }

}
