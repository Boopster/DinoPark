package com.personal.example.dinopark.components;

import com.personal.example.dinopark.models.*;
import com.personal.example.dinopark.models.games.EasyGame;
import com.personal.example.dinopark.models.games.NormalGame;
import com.personal.example.dinopark.repositories.games.EasyRepository;
import com.personal.example.dinopark.repositories.InventoryRepository;
import com.personal.example.dinopark.repositories.PaddockRepository;
import com.personal.example.dinopark.repositories.games.GameRepository;
import com.personal.example.dinopark.repositories.games.NormalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    GameRepository gameRepository;

    @Autowired
    InventoryRepository inventoryRepository;

    @Autowired
    PaddockRepository paddockRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Inventory inventory = new Inventory();
        EasyGame game1 = new EasyGame("Boopster");
        gameRepository.save(game1);
//        Park park1 = game1.getPark();
//        Paddock paddock1 = new Paddock(200, 5, park1);
//        paddockRepository.save(paddock1);
        Inventory inventory2 = new Inventory();
        NormalGame game2 = new NormalGame("Lil-Rox");
        gameRepository.save(game2);
        Inventory inventory3 = new Inventory();
        EasyGame game3 = new EasyGame("Shark Girl");
        gameRepository.save(game3);
    }

}
