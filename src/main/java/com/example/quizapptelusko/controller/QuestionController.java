package com.example.quizapptelusko.controller;

import com.example.quizapptelusko.entity.Question;
import com.example.quizapptelusko.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
      return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
     //we want to add question to the db and we are passing that question from client side
     //as body of the http request in json form, this @RequestBody converts that json data
     //into java objects and is passed to above controller as method parameter.
     //In short, it binds the HTTP request to a method parameter.

        return questionService.addQuestion(question);
    }
}
