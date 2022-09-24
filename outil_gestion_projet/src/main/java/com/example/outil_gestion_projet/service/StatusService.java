package com.example.outil_gestion_projet.service;

import com.example.outil_gestion_projet.model.Status;
import com.example.outil_gestion_projet.repository.StatusRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StatusService {
    private final StatusRepository repository;

    public List<Status> getAll(){
        return repository.findAll();
    }
    public Optional<Status> getById(Long id){
        return repository.findById(id);
    }
}
