package com.qwstion.controller;

import com.qwstion.entities.Question;
import com.qwstion.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping
    public Question create(@RequestBody Question que){
        return questionService.create(que);
    }

    @GetMapping
    public List<Question> getAll(){
        return questionService.getAll();
    }

    @GetMapping("/{id}")
    public Question getOne(@PathVariable Long id){
        return questionService.getOne(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getAllQuestionOfSpecificQuiz(@PathVariable Long quizId){
        return questionService.findQuestionsOfQuiz(quizId);
    }
}


