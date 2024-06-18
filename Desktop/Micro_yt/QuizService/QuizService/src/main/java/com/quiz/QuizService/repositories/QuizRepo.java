package com.quiz.QuizService.repositories;

import com.quiz.QuizService.entities.QuizEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepo extends JpaRepository<QuizEntity,Long> {
}
