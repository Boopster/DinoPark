package com.personal.example.dinopark.controllers;

import com.personal.example.dinopark.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/games")
public class GameController {

    @Autowired
    GameRepository gameRepository;

}
