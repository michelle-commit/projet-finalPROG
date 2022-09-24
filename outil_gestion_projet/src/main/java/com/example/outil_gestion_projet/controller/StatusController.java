package com.example.outil_gestion_projet.controller;

import com.example.outil_gestion_projet.model.Status;
import com.example.outil_gestion_projet.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StatusController {
    @Autowired
    private StatusService statusService;
    @GetMapping("/status")
    public List<Status> getAllStatus(){
        return statusService.getAll();
    }
    @GetMapping("/status/{id}")
    public Optional<Status> getStatusById(@PathVariable Long id){
        return statusService.getById(id);
    }
}