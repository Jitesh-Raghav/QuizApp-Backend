package com.example.quizapptelusko.service;

import com.example.quizapptelusko.Repository.QuestionRepo;
import com.example.quizapptelusko.Repository.QuizRepo;
import com.example.quizapptelusko.entity.Question;
import com.example.quizapptelusko.entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizRepo quizRepo;
    @Autowired
    QuestionRepo questionRepo;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Question> questions = questionRepo.findrandomQuestionByCategory(category,numQ);


        Quiz quiz=new Quiz()
         quiz.setTitle(title);
         quiz.setQuestions(questions);

         quizRepo.save(quiz);
         return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
}
