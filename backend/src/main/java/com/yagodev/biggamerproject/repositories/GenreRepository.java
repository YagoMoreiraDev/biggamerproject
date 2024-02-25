package com.yagodev.biggamerproject.repositories;

import com.yagodev.biggamerproject.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
