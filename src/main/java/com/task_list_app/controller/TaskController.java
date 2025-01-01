package com.task_list_app.controller;

import com.task_list_app.persistence.entity.TaskList;
import com.task_list_app.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<List<TaskList>> findAll(){
        List<TaskList> tasksFromdDB = taskService.findAll();
        return ResponseEntity.ok(tasksFromdDB);
    }

    @PostMapping
    public ResponseEntity<TaskList> createOne(@RequestBody @Valid TaskList taskRequest){
        TaskList taskCreate = taskService.createOne(taskRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(taskCreate);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        boolean deleted = taskService.deleteById(id);
        if (!deleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
