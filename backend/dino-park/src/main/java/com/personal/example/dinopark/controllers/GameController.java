package com.personal.example.dinopark.controllers;

import com.personal.example.dinopark.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/games")
public class GameController {

    @Autowired
    GameRepository gameRepository;



    @GetMapping("{id}")
    public Optional<Game> getGame(@PathVariable Long Id) {
        return gameRepository.findById(Id);
    }


}
