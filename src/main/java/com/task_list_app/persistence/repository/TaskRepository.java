package com.task_list_app.persistence.repository;

import com.task_list_app.persistence.entity.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskList,Long> {
}
