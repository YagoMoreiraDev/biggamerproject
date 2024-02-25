package com.yagodev.biggamerproject.repositories;

import com.yagodev.biggamerproject.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
