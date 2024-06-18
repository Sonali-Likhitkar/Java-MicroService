package com.question.service;

import com.question.entities.Questions;

import java.util.List;

public interface QuesService {

    Questions create(Questions questions);

    List<Questions> getAll();

    Questions getById(Long id);

    List<Questions> getQuestionsOfQuiz(Long quizId);

}
