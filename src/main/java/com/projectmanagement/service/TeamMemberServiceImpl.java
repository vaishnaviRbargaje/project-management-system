package com.projectmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectmanagement.entity.TeamMember;
import com.projectmanagement.repository.TeamMemberRepository;

@Service
public class TeamMemberServiceImpl implements TeamMemberService {

    @Autowired
    private TeamMemberRepository repo;

    @Override
    public TeamMember save(TeamMember teamMember) {
        return repo.save(teamMember);
    }

    @Override
    public List<TeamMember> getAll() {
        return repo.findAll();
    }

    @Override
    public TeamMember getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Team Member not found"));
    }

    @Override
    public TeamMember update(Long id, TeamMember teamMember) {
        TeamMember existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Team Member not found"));

        existing.setName(teamMember.getName());
        existing.setEmail(teamMember.getEmail());
        existing.setRole(teamMember.getRole());
        existing.setDepartment(teamMember.getDepartment());

        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}