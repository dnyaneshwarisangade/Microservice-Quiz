package com.quiz.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz-test")
public class QuizTestController {

    @GetMapping("/test")
    public ResponseEntity <Void> test(){
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public String quizTest(){
        return "This is quiz controller";
    }
}
