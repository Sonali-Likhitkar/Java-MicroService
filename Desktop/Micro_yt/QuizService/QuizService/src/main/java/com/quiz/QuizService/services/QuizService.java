package com.quiz.QuizService.services;

import com.quiz.QuizService.entities.QuizEntity;

import java.util.List;

public interface QuizService {

    QuizEntity add(QuizEntity quizEntity);

    List<QuizEntity> getAll();

    QuizEntity getById(Long id);

}
