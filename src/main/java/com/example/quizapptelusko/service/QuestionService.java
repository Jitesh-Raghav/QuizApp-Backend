package com.example.quizapptelusko.service;

import com.example.quizapptelusko.Repository.QuestionRepo;
import com.example.quizapptelusko.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public List<Question> getAllQuestions() {
     return questionRepo.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionRepo.findByCategory(category);
    }
}
