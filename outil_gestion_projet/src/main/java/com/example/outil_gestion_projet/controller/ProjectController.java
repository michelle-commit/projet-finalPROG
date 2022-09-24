package com.example.outil_gestion_projet.controller;

import com.example.outil_gestion_projet.model.Project;
import com.example.outil_gestion_projet.model.User;
import com.example.outil_gestion_projet.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @GetMapping("/project")
    public List<Project> getAll(){
        return projectService.getAll();
    }
    @GetMapping("/project/{id}")
    public Optional<Project> getProjectById(@PathVariable Long id ){
        return projectService.getById(id);
    }
    @PostMapping("/project")
    public String saveProject(@RequestBody List<Project> projects){
        return projectService.saveAll(projects).toString();
    }
}
