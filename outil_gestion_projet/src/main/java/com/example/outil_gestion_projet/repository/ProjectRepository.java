package com.example.outil_gestion_projet.repository;

import com.example.outil_gestion_projet.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {

}
