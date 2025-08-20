package com.quiz.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Do not make this class Entity as do not want to save data in database

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    private Long questionId;

    private String question;

    private Long quizId;

}

