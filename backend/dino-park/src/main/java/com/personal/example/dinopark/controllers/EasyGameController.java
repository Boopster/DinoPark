package com.personal.example.dinopark.controllers;

import com.personal.example.dinopark.models.games.EasyGame;
import com.personal.example.dinopark.repositories.games.EasyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value="/easyGames")
public class EasyGameController {

    @Autowired
    EasyRepository easyRepository;

    @GetMapping("{id}")
    public Optional<EasyGame> getEasyGame(@PathVariable Long Id) {
        return easyRepository.findById(Id);
    }

}