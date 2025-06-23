package com.example.PokerPlanningBack.repository;

import com.example.PokerPlanningBack.model.CommentDTO;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<CommentDTO,String> {
    List<CommentDTO> findByProjectIdAndTaskId(String projectId, String taskId);
    Optional<CommentDTO> findByProjectIdAndTaskIdAndId(String projectId, String taskId, String commentId);
}
