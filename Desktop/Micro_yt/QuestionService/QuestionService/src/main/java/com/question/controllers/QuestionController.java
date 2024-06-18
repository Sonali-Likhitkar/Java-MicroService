package com.question.controllers;

import com.question.entities.Questions;
import com.question.service.QuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuesService quesService;

    @PostMapping("/createQuestion")
    public Questions createQuestion(@RequestBody Questions questions){
        return  quesService.create(questions);
    }

    @GetMapping("/getAll")
    public List<Questions> getAllQuestions(){
        return quesService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Questions getById (@PathVariable Long id){
        return quesService.getById(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Questions> getQuestionsOfQuiz(@PathVariable Long quizId){
        return quesService.getQuestionsOfQuiz(quizId);
    }

}
