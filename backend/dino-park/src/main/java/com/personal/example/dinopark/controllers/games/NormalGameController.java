package com.personal.example.dinopark.controllers.games;

import com.personal.example.dinopark.models.games.NormalGame;
import com.personal.example.dinopark.repositories.games.NormalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value="/normalGames")
public class NormalGameController {

    @Autowired
    NormalRepository normalRepository;

    @GetMapping("{id}")
    public Optional<NormalGame> getNormalGame(@PathVariable Long Id) {
        return normalRepository.findById(Id);
    }

}
