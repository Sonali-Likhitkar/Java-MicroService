package com.quiz.QuizService.controllers;

import com.quiz.QuizService.entities.QuizEntity;
import com.quiz.QuizService.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizController")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    // Create
    @PostMapping("/createQuiz")
    public QuizEntity create(@RequestBody QuizEntity quizEntity) {
        return quizService.add(quizEntity);
    }

    @GetMapping("/getById/{id}")
    public QuizEntity getQuizById(@PathVariable Long id) {
        return quizService.getById(id);
    }

    @GetMapping("/getAll")
    public List<QuizEntity> getAllQuiz() {
        return quizService.getAll();
    }


}
