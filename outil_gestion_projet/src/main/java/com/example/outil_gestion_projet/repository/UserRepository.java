package com.example.outil_gestion_projet.repository;

import com.example.outil_gestion_projet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
