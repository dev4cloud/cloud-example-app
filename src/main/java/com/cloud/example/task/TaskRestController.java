package com.cloud.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.LinkOption;
import java.util.List;

@RestController
public class TaskRestController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> all() {
        return this.taskService.findAll();
    }

    @GetMapping("/tasks/{id}")
    public Task one(@PathVariable Long id) {
        return this.taskService.findById(id).orElseThrow(TaskNotFoundException::new);
    }

    @PostMapping("/tasks")
    public Task newTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }

    @PutMapping("/tasks/{id}")
    public Task updateTask(@RequestBody Task newTask, @PathVariable Long id) {
        return this.taskService.findById(id)
                .map(task -> {
                    task.setTitle(newTask.getTitle());
                    task.setDescription(newTask.getDescription());
                    task.setPriority(newTask.getPriority());
                    return taskService.save(task);
                 }).orElseGet(() -> {
                     newTask.setId(id);
                     return taskService.save(newTask);
                });
    }


    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable Long id) {
        this.taskService.deleteById(id);
    }

    static class TaskNotFoundException extends RuntimeException {

    }
}
