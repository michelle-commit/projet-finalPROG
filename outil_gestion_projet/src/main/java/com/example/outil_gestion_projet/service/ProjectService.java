package com.example.outil_gestion_projet.service;

import com.example.outil_gestion_projet.model.Project;
import com.example.outil_gestion_projet.model.User;
import com.example.outil_gestion_projet.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProjectService {
    private final ProjectRepository repository;

    public List<Project> getAll(){
        return repository.findAll();
    }
    public Optional<Project> getById(Long id){
        return repository.findById(id);
    }
    @Transactional
    public List<Project> saveAll(List<Project>projects){
        return repository.saveAll(projects);
    }
}
