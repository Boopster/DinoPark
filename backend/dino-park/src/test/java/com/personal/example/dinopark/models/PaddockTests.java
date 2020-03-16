package com.personal.example.dinopark.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PaddockTests {

    Park park;
    Paddock paddock;
    Dinosaur dinosaur;

    @Before
    public void setUp() {
        park = new Park("Dino Land");
        paddock = new Paddock(5, 200, park);
        dinosaur = new Dinosaur("T-Rex", "Carnivore");
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, paddock.getCapacity());
    }

    @Test
    public void canSetCapacity() {
        paddock.setCapacity(4);
        assertEquals(4, paddock.getCapacity());
    }

    @Test
    public void hasPrice() {
        assertEquals(200, paddock.getPrice());
    }

    @Test
    public void canSetPrice() {
        paddock.setPrice(150);
        assertEquals(150, paddock.getPrice());
    }

    @Test
    public void hasPark() {
        assertNotNull(paddock.getPark());
    }

//    @Test
//    public void canGetDinosaurCount() {
//        assertEquals(0, paddock.getDinosaurCount());
//    }
//
//    @Test
//    public void canAddDinosaurToPaddock() {
//        paddock.addDinosaurToPaddock(dinosaur);
//        assertEquals(1, paddock.getDinosaurCount());
//    }

}
