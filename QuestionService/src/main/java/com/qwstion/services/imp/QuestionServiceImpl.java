package com.qwstion.services.imp;

import com.qwstion.entities.Question;
import com.qwstion.repositories.QuestionRepo;
import com.qwstion.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepo questionRepo;

    @Override
    public Question create(Question que) {
        return questionRepo.save(que);
    }

    @Override
    public List<Question> getAll() {
        return questionRepo.findAll();
    }

    @Override
    public Question getOne(Long id) {
        return questionRepo.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
    }

    @Override
    public List<Question> findQuestionsOfQuiz(Long quizId) {
        return questionRepo.findByQuizId(quizId);
    }
}
