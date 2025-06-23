package com.example.PokerPlanningBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    public Developer(String id) {
        this.id = id;
    }

    public Developer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
