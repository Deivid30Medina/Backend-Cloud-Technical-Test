package com.task_list_app.service.impl;

import com.task_list_app.persistence.entity.TaskList;
import com.task_list_app.persistence.repository.TaskRepository;
import com.task_list_app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<TaskList> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public TaskList createOne(TaskList taskRequest) {
        return taskRepository.save(taskRequest);
    }

    @Override
    public boolean deleteById(Long id) {
        Optional<TaskList> task = taskRepository.findById(id);
        if (task.isPresent()) {
            taskRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
