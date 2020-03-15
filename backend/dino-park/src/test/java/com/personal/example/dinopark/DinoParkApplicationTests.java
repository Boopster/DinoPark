package com.personal.example.dinopark;

import com.personal.example.dinopark.models.Game;
import com.personal.example.dinopark.repositories.GameRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DinoParkApplicationTests {

	@Autowired
	GameRepository gameRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateGameAndSave(){
		int intialGamesCount = gameRepository.findAll().size();
		Game game = new Game("Jack", "Sparrow", "normal", 2000);
		gameRepository.save(game);
		assertEquals(intialGamesCount + 1, gameRepository.findAll().size());
	}

}
