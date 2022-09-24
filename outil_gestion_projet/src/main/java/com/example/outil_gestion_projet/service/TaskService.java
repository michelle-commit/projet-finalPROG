package com.example.outil_gestion_projet.service;

import com.example.outil_gestion_projet.model.Project;
import com.example.outil_gestion_projet.model.Role;
import com.example.outil_gestion_projet.model.Task;
import com.example.outil_gestion_projet.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository repository;
    public List<Task> getAll(){
        return repository.findAll();
    }
    public Optional<Task> getById(Long id){
        return repository.findById(id);
    }
    @Transactional
    public List<Task> saveAll(List<Task>tasks){
        return repository.saveAll(tasks);
    }
}
