package com.personal.example.dinopark.controllers;

import com.personal.example.dinopark.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventories")
public class InventoryController {

    @Autowired
    InventoryRepository inventoryRepository;
}
