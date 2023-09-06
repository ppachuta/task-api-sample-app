package com.sampleapp.controller;

import java.util.List;

import com.sampleapp.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sampleapp.service.TaskService;

@RestController
@RequestMapping("api/v1/")
public class TaskController {

    @Autowired
    private TaskService taskService;


    public TaskController() {
    }

    @RequestMapping("/test")
    public String test() {
        return "It's just a test";
    }

    @RequestMapping(value = "tasks", method = RequestMethod.GET)
    public List<Task> list() {
        return taskService.getTasks();
    }

    @RequestMapping(value = "tasks", method = RequestMethod.POST)
    public Task create(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @RequestMapping(value = "tasks/{id}", method = RequestMethod.GET)
    public Task get(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }


}
