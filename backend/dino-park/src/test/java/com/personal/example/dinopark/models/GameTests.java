package com.personal.example.dinopark.models;

import com.personal.example.dinopark.models.games.EasyGame;
import com.personal.example.dinopark.models.games.NormalGame;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GameTests {

    EasyGame game1;
    NormalGame game2;
    Inventory inventory1;

    @Before
    public void setUp() {
        inventory1 = new Inventory();
        game1 = new EasyGame("Boopster");
        game2 = new NormalGame("Lily");
    }

    @Test
    public void hasUsername() {
        assertEquals("Boopster", game1.getUsername());
    }

    @Test
    public void canSetUsername() {
        game1.setUsername("Boop");
        assertEquals("Boop", game1.getUsername());
    }

    @Test
    public void hasDifficultyEasy() {
        assertEquals("easy", game1.getDifficulty());
    }

    @Test
    public void hasDifficultyNormal() {
        assertEquals("normal", game2.getDifficulty());
    }

    @Test
    public void canSetDifficulty() {
        game1.setDifficulty("normal");
        assertEquals("normal", game1.getDifficulty());
    }

    @Test
    public void hasBalanceEasy() {
        assertEquals(2000, game1.getBalance());
    }

    @Test
    public void hasBalanceNormal() {
        assertEquals(1500, game2.getBalance());
    }

    @Test
    public void canSetBalance() {
        game1.setBalance(1500);
        assertEquals(1500, game1.getBalance());
    }

//    @Test
//    public void hasPark() {
//        assertNotNull(game.getPark());
//    }

    @Test
    public void hasInventory() {
        game1.setInventory(inventory1);
        assertNotNull(game1.getInventory());
    }

}
