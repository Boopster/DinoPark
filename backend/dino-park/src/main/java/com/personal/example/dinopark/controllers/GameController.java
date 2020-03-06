package com.personal.example.dinopark.controllers;

import com.personal.example.dinopark.models.Game;
import com.personal.example.dinopark.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class GameController {

    @Autowired
    GameRepository gameRepository;

    @RequestMapping(value="/games", method= RequestMethod.GET)
    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }

}
