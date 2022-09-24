package com.example.outil_gestion_projet.controller;

import com.example.outil_gestion_projet.model.Role;
import com.example.outil_gestion_projet.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RoleController {
   @Autowired
   private RoleService roleService;

   @GetMapping("/role")
   public List<Role> getAllRole() {
       return roleService.getAll();
   }
   public Optional<Role> getRoleById(@PathVariable Long id){
       return roleService.getById(id);
   }
}
