package com.personal.example.dinopark.repositories;

import com.personal.example.dinopark.models.Paddock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaddockRepository extends JpaRepository<Paddock, Long> {
}
