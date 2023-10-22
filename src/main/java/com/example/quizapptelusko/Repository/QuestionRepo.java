package com.example.quizapptelusko.Repository;

import com.example.quizapptelusko.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question,Integer> {

List<Question> findByCategory(String category);

}
