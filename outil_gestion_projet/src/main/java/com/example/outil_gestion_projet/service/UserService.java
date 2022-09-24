package com.example.outil_gestion_projet.service;

import com.example.outil_gestion_projet.model.User;
import com.example.outil_gestion_projet.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;

    public List<User> getAll(){
        return repository.findAll();
    }
    public Optional<User> getById(Long id) {
        return repository.findById(id);
    }
    @Transactional
    public List<User> saveAll(List<User>users){
        return repository.saveAll(users);
    }
}