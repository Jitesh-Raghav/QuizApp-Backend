package com.example.quizapptelusko.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "question")
@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "question_title")
    private String questionTitle;

    @Column(name = "option1")
    private String option1;

    @Column(name = "option2")
    private String option2;

    @Column(name = "option3")
    private String option3;

    @Column(name = "option4")
    private String option4;

    @Column(name = "right_answer")
    private String rightAnswer;

    @Column(name = "difficulty_level")
    private String difficultylevel;

    @Column(name = "category")
    private String category;

    // Constructors, getters, setters, and other methods
}
