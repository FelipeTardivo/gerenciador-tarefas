package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> findAll() {
        return repository.findAll();
    }

    public Task save(Task task) {
        return repository.save(task);
    }

    public Task update(Task task) {
        return repository.save(task); // save também serve para atualizar
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Optional<Task> findById(Long id) {
        return repository.findById(id);
    }
}

