package com.personal.example.dinopark.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InventoryTests {

    Inventory inventory;

    @Before
    public void setUp() {
        inventory = new Inventory();
    }

    @Test
    public void canGetMeatCount() {
        assertEquals(0, inventory.getMeatCount());
    }

//    @Test
//    public void canSetMeatCount() {
//        inventory.setMeatCount(1);
//        assertEquals(1, inventory.getMeatCount());
//    }

//    @Test
//    public void canGetMushroomCount() {
//        assertEquals(0, inventory.getMushroomCount());
//    }

//    @Test
//    public void canSetMushroomCount() {
//        inventory.setMushroomCount(1);
//        assertEquals(1, inventory.getMushroomCount());
//    }

//    @Test
//    public void canGetDinoEggCount() {
//        assertEquals(0, inventory.getDinoEggCount());
//    }

//    @Test
//    public void canSetDinoEggCount() {
//        inventory.setDinoEggCount(1);
//        assertEquals(1, inventory.getDinoEggCount());
//    }

//    @Test
//    public void canGetMedicineCount() {
//        assertEquals(0, inventory.getMedicineCount());
//    }

//    @Test
//    public void canSetMedicineCount() {
//        inventory.setMedicineCount(1);
//        assertEquals(1, inventory.getMedicineCount());
//    }

}
