package com.personal.example.dinopark.controllers.games;

import com.personal.example.dinopark.models.games.Game;
import com.personal.example.dinopark.repositories.games.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping(value="/games")
public class GameController {

    @Autowired
    GameRepository gameRepository;


    @GetMapping("{id}")
    public Optional<Game> getGame(@PathVariable Long Id) {
        return gameRepository.findById(Id);
    }


}
