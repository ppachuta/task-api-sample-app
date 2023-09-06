package com.sampleapp.service;

import java.util.List;

import com.sampleapp.model.Task;

public interface TaskService {

    List<Task> getTasks();

    Task createTask(Task task);

    Task getTaskById(Long id);

}
