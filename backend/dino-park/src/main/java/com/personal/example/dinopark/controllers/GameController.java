package com.personal.example.dinopark.controllers;

import com.personal.example.dinopark.models.Game;
import com.personal.example.dinopark.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
