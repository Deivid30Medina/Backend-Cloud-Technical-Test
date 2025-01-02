package com.task_list_app.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class TaskList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Title cannot be empty")
    @Size(max = 100, message = "The title cannot be longer than 100 characters.")
    @NotBlank(message = "Title cannot be empty or just spaces.")
    private String title;

    @NotNull(message = "Description can not be empty")
    @Size(max = 255, message = "The description cannot be longer than 255 characters.")
    @NotBlank(message = "Description can not be empty or just spaces.")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 255, message = "The description cannot be longer than 255 characters.") String description) {
        this.description = description;
    }
}
