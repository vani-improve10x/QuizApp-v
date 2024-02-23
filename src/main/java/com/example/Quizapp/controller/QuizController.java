package com.example.Quizapp.controller;

import com.example.Quizapp.model.Question;
import com.example.Quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title) {
        return quizService.createQuiz(category, numQ, title);
    }
    @GetMapping("get/{id}")

    public ResponseEntity<List<Question>> getQuizQuestions(@PathVariable("id") Integer id){
        
    }
}
