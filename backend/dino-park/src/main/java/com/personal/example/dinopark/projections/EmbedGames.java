package com.personal.example.dinopark.projections;

import com.personal.example.dinopark.models.*;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedGames", types = Game.class)
public interface EmbedGames {

    Long getId();
    String getUsername();
    String getDifficulty();
    int getBalance();
    Park getPark();
    Inventory getInventory();

}
