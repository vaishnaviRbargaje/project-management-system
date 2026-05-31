package com.projectmanagement.service;

import java.util.List;
import com.projectmanagement.entity.TeamMember;

public interface TeamMemberService {

    TeamMember save(TeamMember teamMember);

    List<TeamMember> getAll();

    TeamMember getById(Long id);

    TeamMember update(Long id, TeamMember teamMember);

    void delete(Long id);
}