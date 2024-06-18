package com.question.serviceimpl;

import com.question.entities.Questions;
import com.question.repositories.QuesRepo;
import com.question.service.QuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuesServiceImpl implements QuesService {

    @Autowired
    private QuesRepo quesRepo;
    @Override
    public Questions create(Questions questions) {
        return quesRepo.save(questions);
    }

    @Override
    public List<Questions> getAll() {
        return quesRepo.findAll();
    }

    @Override
    public Questions getById(Long id) {
        return quesRepo.findById(id).get();
    }


    //get Questions of Specific Quiz
    @Override
    public List<Questions> getQuestionsOfQuiz(Long quizId) {
        return quesRepo.findByQuizId(quizId);
    }
}
