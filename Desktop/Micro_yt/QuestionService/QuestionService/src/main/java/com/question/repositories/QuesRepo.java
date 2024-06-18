package com.question.repositories;

import com.question.entities.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuesRepo extends JpaRepository<Questions, Long> {

    List<Questions> findByQuizId(long quizId);
}
