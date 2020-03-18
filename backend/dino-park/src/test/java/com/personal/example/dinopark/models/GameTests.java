package com.personal.example.dinopark.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GameTests {

    Game game;
    Inventory inventory;

    @Before
    public void setUp() {
        inventory = new Inventory();
        game = new Game("Boopster", "normal");
    }

    @Test
    public void hasUsername() {
        assertEquals("Boopster", game.getUsername());
    }

    @Test
    public void canSetUsername() {
        game.setUsername("Boop");
        assertEquals("Boop", game.getUsername());
    }

    @Test
    public void hasDifficulty() {
        assertEquals("normal", game.getDifficulty());
    }

    @Test
    public void canSetDifficulty() {
        game.setDifficulty("easy");
        assertEquals("easy", game.getDifficulty());
    }

    @Test
    public void hasBalance() {
        assertEquals(2000, game.getBalance());
    }

    @Test
    public void canSetBalance() {
        game.setBalance(1500);
        assertEquals(1500, game.getBalance());
    }

//    @Test
//    public void hasPark() {
//        assertNotNull(game.getPark());
//    }

    @Test
    public void hasInventory() {
        game.setInventory(inventory);
        assertNotNull(game.getInventory());
    }

}
