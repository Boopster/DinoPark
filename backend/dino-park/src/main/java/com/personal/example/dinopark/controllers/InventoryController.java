package com.personal.example.dinopark.controllers;

import com.personal.example.dinopark.models.Inventory;
import com.personal.example.dinopark.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/inventories")
public class InventoryController {

    @Autowired
    InventoryRepository inventoryRepository;

    @GetMapping("{id}")
    public Optional<Inventory> getGame(@PathVariable Long Id) {
        return inventoryRepository.findById(Id);
    }
}
