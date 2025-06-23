package com.example.PokerPlanningBack.repository;

import com.example.PokerPlanningBack.model.TaskDTO;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<TaskDTO,String> {
    List<TaskDTO> findBySprintId(String sprintId);
    List<TaskDTO> findByProjectId(String projectId);
    Optional<TaskDTO> findByProjectIdAndId(String projectId,String taskId);
    Optional<TaskDTO> findByProjectIdAndSprintIdAndId(String projectId, String sprintId, String taskId);
    void deleteByProjectIdAndSprintIdAndId(String projectId, String sprintId, String taskId);
    void deleteByProjectIdAndId(String projectId, String taskId);
}
