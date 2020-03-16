package com.personal.example.dinopark.repositories;

import com.personal.example.dinopark.models.Dinosaur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DinosaurRepository extends JpaRepository<Dinosaur, Long> {
}
