package com.personal.example.dinopark.controllers;

import com.personal.example.dinopark.models.Game;
import com.personal.example.dinopark.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/games")
public class GameController {

    @Autowired
    GameRepository gameRepository;

    @GetMapping
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Game> getGame(@PathVariable Long Id) {
        return gameRepository.findById(Id);
    }

}
