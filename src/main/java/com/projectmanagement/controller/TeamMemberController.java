package com.projectmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projectmanagement.entity.TeamMember;
import com.projectmanagement.service.TeamMemberService;

@RestController
@RequestMapping("/api/team-members")
public class TeamMemberController {

    @Autowired
    private TeamMemberService service;

    @PostMapping
    public TeamMember save(@RequestBody TeamMember teamMember) {
        return service.save(teamMember);
    }

    @GetMapping
    public List<TeamMember> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TeamMember getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public TeamMember update(@PathVariable Long id,
                             @RequestBody TeamMember teamMember) {
        return service.update(id, teamMember);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Team Member deleted successfully";
    }
}