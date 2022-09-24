package com.example.outil_gestion_projet.service;

import com.example.outil_gestion_projet.model.Role;
import com.example.outil_gestion_projet.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RoleService {
   private final RoleRepository repository;
   public List<Role> getAll(){
       return repository.findAll();
   }
   public Optional<Role> getById(Long id){
       return repository.findById(id);
   }
}
