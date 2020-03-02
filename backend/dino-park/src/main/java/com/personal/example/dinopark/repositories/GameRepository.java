package com.personal.example.dinopark.repositories;

import com.personal.example.dinopark.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {

}
