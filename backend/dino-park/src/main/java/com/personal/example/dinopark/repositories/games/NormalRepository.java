package com.personal.example.dinopark.repositories.games;

import com.personal.example.dinopark.models.games.Normal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NormalRepository extends JpaRepository<Normal, Long> {
}
