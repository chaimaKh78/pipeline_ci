package com.example.PokerPlanningBack.repository;

import com.example.PokerPlanningBack.model.SprintDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SprintRepository extends JpaRepository<SprintDTO,String> {
    List<SprintDTO> findByProjectId(String projectId);
    Optional<SprintDTO> findByProjectIdAndId(String projectId, String id);
    void deleteByProjectIdAndId(String projectId, String sprintId);
}
