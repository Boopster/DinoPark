package com.personal.example.dinopark;

import com.personal.example.dinopark.models.games.EasyGame;
import com.personal.example.dinopark.models.Inventory;
import com.personal.example.dinopark.repositories.games.EasyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DinoParkApplicationTests {

	@Autowired
	EasyRepository easyRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createGameAndInventory() {
		Inventory inventory = new Inventory();
		EasyGame game = new EasyGame("Boopster");
		game.setInventory(inventory);
		easyRepository.save(game);
		assertNotNull(game.getInventory());
	}

}
