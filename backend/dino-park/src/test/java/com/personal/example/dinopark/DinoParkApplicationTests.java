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
	public void createGame() {
		Game game = new Game("Boopster", "easy", "Dino World");
		gameRepository.save(game);
		assertEquals(2000, game.getBalance());
	}

}
