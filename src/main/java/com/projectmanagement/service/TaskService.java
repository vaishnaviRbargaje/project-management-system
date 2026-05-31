package com.projectmanagement.service;

import java.util.List;
import com.projectmanagement.entity.Task;

public interface TaskService {

    Task save(Task task);

    List<Task> getAll();

    Task getById(Long id);

    Task update(Long id, Task task);

    void delete(Long id);
}