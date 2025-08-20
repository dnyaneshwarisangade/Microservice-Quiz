package com.qwstion.repositories;

import com.qwstion.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question,Long> {

    // follow syntax for custom finder methond Find + By+QuizId

    List<Question> findByQuizId(Long id);
}
