package com.example.outil_gestion_projet.controller;

import com.example.outil_gestion_projet.model.Task;
import com.example.outil_gestion_projet.repository.TaskRepository;
import com.example.outil_gestion_projet.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {
    @Autowired
   private TaskService taskService;
    @GetMapping("/task")
   public List<Task> getAllTask(){
      return taskService.getAll();
   }
   @GetMapping("/task/{id}")
   public Optional<Task> getTaskById(@PathVariable Long id){
        return taskService.getById(id);
   }
}
