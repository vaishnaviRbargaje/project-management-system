package com.projectmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectmanagement.entity.Project;
import com.projectmanagement.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository repo;

    @Override
    public Project save(Project project) {
        return repo.save(project);
    }

    @Override
    public List<Project> getAll() {
        return repo.findAll();
    }

    @Override
    public Project getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));
    }

    @Override
    public Project update(Long id, Project project) {
        Project existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));

        existing.setProjectName(project.getProjectName());
        existing.setDescription(project.getDescription());
        existing.setStartDate(project.getStartDate());
        existing.setEndDate(project.getEndDate());
        existing.setStatus(project.getStatus());

        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}