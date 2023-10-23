package com.example.quizapptelusko.Repository;

import com.example.quizapptelusko.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {
}
