package com.example.Quizapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
@Entity
public class Question {
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String category;
    private String difficultylevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String questionTitle;
    private String rightTitle;
}
