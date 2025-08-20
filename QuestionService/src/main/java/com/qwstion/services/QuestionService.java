package com.qwstion.services;

import com.qwstion.entities.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question que);

    List<Question> getAll();

    Question getOne(Long id);

    List<Question> findQuestionsOfQuiz(Long quizId);

}
