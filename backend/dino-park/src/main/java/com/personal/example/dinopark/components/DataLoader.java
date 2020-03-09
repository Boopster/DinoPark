package com.personal.example.dinopark.components;

import com.personal.example.dinopark.models.Game;
import com.personal.example.dinopark.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    GameRepository gameRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Game game1 = new Game("Boopster", "Dino World", "easy", 2000);
        gameRepository.save(game1);
        Game game2 = new Game("Lil-Rox", "Dino Land", "easy", 2000);
        gameRepository.save(game2);
        Game game3 = new Game("Shark Girl", "T-Rex World", "easy", 2000);
        gameRepository.save(game3);
    }

}
