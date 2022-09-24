package com.example.outil_gestion_projet.repository;

import com.example.outil_gestion_projet.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
