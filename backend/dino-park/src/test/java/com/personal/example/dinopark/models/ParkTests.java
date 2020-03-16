package com.personal.example.dinopark.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ParkTests {

    Park park;
    Paddock paddock;

    @Before
    public void setUp() {
        park = new Park("Dino World");
        paddock = new Paddock(5, 200, park);
    }

    @Test
    public void hasParkName() {
        assertEquals("Dino World", park.getParkName());
    }

    @Test
    public void canSetParkName() {
        park.setParkName("DinoWorld");
        assertEquals("DinoWorld", park.getParkName());
    }

    @Test
    public void hasRating() {
        assertEquals(100, park.getRating());
    }

    @Test
    public void canSetRating() {
        park.setRating(90);
        assertEquals(90, park.getRating());
    }

    @Test
    public void canGetPaddockCount() {
        assertEquals(0, park.getPaddockCount());
    }

    @Test
    public void canAddPaddockToPark() {
        park.addPaddockToPark(paddock);
        assertEquals(1, park.getPaddockCount());
    }

}
