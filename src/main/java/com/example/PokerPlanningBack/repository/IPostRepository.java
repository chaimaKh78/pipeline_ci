package com.example.PokerPlanningBack.repository;

import com.example.PokerPlanningBack.model.EPost;
import com.example.PokerPlanningBack.model.Post;
import com.example.PokerPlanningBack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface IPostRepository extends JpaRepository<Post,String> {
    Optional<Post>findByName(EPost name);




}
