package com.quiz.QuizService.impl;

import com.quiz.QuizService.entities.QuizEntity;
import com.quiz.QuizService.repositories.QuizRepo;
import com.quiz.QuizService.services.QuestionClient;
import com.quiz.QuizService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepo quizRepo;
    @Autowired
    private QuestionClient questionClient;


    @Override
    public QuizEntity add(QuizEntity quizEntity) {
        return quizRepo.save(quizEntity);
    }

    @Override
    public List<QuizEntity> getAll() {
        List<QuizEntity> quizes= quizRepo.findAll();

        List<QuizEntity> newQuizList = quizes.stream().map(quiz-> {
            quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
        return newQuizList;
    }

    @Override
    public QuizEntity getById(Long id) {
        QuizEntity quiz = quizRepo.findById(id).orElseThrow(() -> new RuntimeException("Quiz not Found"));
         quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
        return quiz;
    }
}
