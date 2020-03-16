package com.personal.example.dinopark.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DinosaurTests {

    Park park;
    Paddock paddock;
    Dinosaur dinosaur;

    @Before
    public void setUp() {
        park = new Park("Dino Land");
        paddock = new Paddock(200, 5, park);
        dinosaur = new Dinosaur("Diplodocus", "Herbivore", paddock);
    }

    @Test
    public void hasSpecies() {
        assertEquals("Diplodocus", dinosaur.getSpecies());
    }

    @Test
    public void canSetSpecies() {
        dinosaur.setSpecies("T-Rex");
        assertEquals("T-Rex", dinosaur.getSpecies());
    }

    @Test
    public void hasDiet() {
        assertEquals("Herbivore", dinosaur.getDiet());
    }

    @Test
    public void canSetDiet() {
        dinosaur.setDiet("Carnivore");
        assertEquals("Carnivore", dinosaur.getDiet());
    }

    @Test
    public void hasHealth() {
        assertEquals(10, dinosaur.getHealth());
    }

    @Test
    public void canSetHealth() {
        dinosaur.setHealth(9);
        assertEquals(9, dinosaur.getHealth());
    }

    @Test
    public void hasAge() {
        assertEquals(0, dinosaur.getAge());
    }

    @Test
    public void canSetAge() {
        dinosaur.setAge(1);
        assertEquals(1, dinosaur.getAge());
    }

    @Test
    public void hasPaddock() {
        assertNotNull(dinosaur.getPaddock());
    }

}
