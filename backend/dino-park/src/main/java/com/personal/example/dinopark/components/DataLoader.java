package com.personal.example.dinopark.components;

import com.personal.example.dinopark.models.Game;
import com.personal.example.dinopark.models.Inventory;
import com.personal.example.dinopark.models.Paddock;
import com.personal.example.dinopark.models.Park;
import com.personal.example.dinopark.repositories.GameRepository;
import com.personal.example.dinopark.repositories.InventoryRepository;
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
    InventoryRepository inventoryRepository;

    @Autowired
    PaddockRepository paddockRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Inventory inventory = new Inventory();
        Game game1 = new Game("Boopster", "easy");
        gameRepository.save(game1);
//        Park park1 = game1.getPark();
//        Paddock paddock1 = new Paddock(200, 5, park1);
//        paddockRepository.save(paddock1);
        Inventory inventory2 = new Inventory();
        Game game2 = new Game("Lil-Rox", "easy");
        gameRepository.save(game2);
        Inventory inventory3 = new Inventory();
        Game game3 = new Game("Shark Girl", "easy");
        gameRepository.save(game3);
    }

}
