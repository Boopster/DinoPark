package com.personal.example.dinopark.components;

import com.personal.example.dinopark.models.*;
import com.personal.example.dinopark.models.games.Easy;
import com.personal.example.dinopark.repositories.games.EasyRepository;
import com.personal.example.dinopark.repositories.InventoryRepository;
import com.personal.example.dinopark.repositories.PaddockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    EasyRepository easyRepository;

    @Autowired
    InventoryRepository inventoryRepository;

    @Autowired
    PaddockRepository paddockRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Inventory inventory = new Inventory();
        Easy game1 = new Easy("Boopster", "easy");
        easyRepository.save(game1);
//        Park park1 = game1.getPark();
//        Paddock paddock1 = new Paddock(200, 5, park1);
//        paddockRepository.save(paddock1);
        Inventory inventory2 = new Inventory();
        Easy game2 = new Easy("Lil-Rox", "easy");
        easyRepository.save(game2);
        Inventory inventory3 = new Inventory();
        Easy game3 = new Easy("Shark Girl", "easy");
        easyRepository.save(game3);
    }

}
