package com.example.PokerPlanningBack.repository;

import com.example.PokerPlanningBack.model.ProjectDTO;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ProjectRepository extends JpaRepository<ProjectDTO,String> {
}
