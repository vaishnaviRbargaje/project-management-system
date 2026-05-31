package com.projectmanagement.service;

import java.util.List;
import com.projectmanagement.entity.Project;

public interface ProjectService {

    Project save(Project project);

    List<Project> getAll();

    Project getById(Long id);

    Project update(Long id, Project project);

    void delete(Long id);
}