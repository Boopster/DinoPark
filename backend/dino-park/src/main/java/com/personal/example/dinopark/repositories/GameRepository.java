package com.personal.example.dinopark.repositories;

import com.personal.example.dinopark.models.Game;
import com.personal.example.dinopark.projections.EmbedGames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {
}
