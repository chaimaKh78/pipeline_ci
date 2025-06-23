package com.example.PokerPlanningBack.repository;

import com.example.PokerPlanningBack.model.EPost;
import com.example.PokerPlanningBack.model.Post;
import com.example.PokerPlanningBack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IUserRepository extends JpaRepository<User,String> {
    Optional<User> findUserById(String user);

    Optional<User>findByUserName(String username);
    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);

    List<User> findByPost(EPost post);


    //List<User> findByPosts_Name(EPost post);


}
