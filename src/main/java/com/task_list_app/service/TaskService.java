package com.task_list_app.service;

import com.task_list_app.persistence.entity.TaskList;
import jakarta.validation.Valid;

import java.util.List;


public interface TaskService {
    List<TaskList> findAll();

    TaskList createOne(@Valid TaskList taskRequest);

    boolean deleteById(Long id);
}
