package com.example.outil_gestion_projet.repository;

import com.example.outil_gestion_projet.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
