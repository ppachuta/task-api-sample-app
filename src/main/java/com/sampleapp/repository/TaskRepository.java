package com.sampleapp.repository;

import java.util.List;

import com.sampleapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
