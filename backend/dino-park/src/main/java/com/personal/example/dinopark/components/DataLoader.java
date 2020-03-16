package com.personal.example.dinopark.components;

import com.personal.example.dinopark.models.Game;
import com.personal.example.dinopark.models.Paddock;
import com.personal.example.dinopark.models.Park;
import com.personal.example.dinopark.repositories.GameRepository;
import com.personal.example.dinopark.repositories.PaddockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    GameRepository gameRepository;

    @Autowired
    PaddockRepository paddockRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Game game1 = new Game("Boopster", "easy", "Dino World");
        gameRepository.save(game1);
        Park park1 = game1.getPark();
        Paddock paddock1 = new Paddock(200, 5, park1);
        paddockRepository.save(paddock1);
        Game game2 = new Game("Lil-Rox", "easy", "Dino Land");
        gameRepository.save(game2);
        Game game3 = new Game("Shark Girl", "easy", "T-Rex World");
        gameRepository.save(game3);
    }

}
