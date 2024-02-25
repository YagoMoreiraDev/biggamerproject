package com.yagodev.biggamerproject.repositories;

import com.yagodev.biggamerproject.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
