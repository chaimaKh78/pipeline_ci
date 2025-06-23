package com.example.PokerPlanningBack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rayen Benoun
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @NonNull
    private String userName;
    @NonNull
    @Size(max = 50)
    private String email;
    @NonNull
    @Size(max = 120)
    private String password;
    @NonNull
    private EPost post;
    @Enumerated(EnumType.STRING)
    private Statut statut; // Ensure this is the correct field

    private Date createdAt;
    private Date updatedAt;

    @ManyToMany
    private Set<Post> posts = new HashSet<>();

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

}
