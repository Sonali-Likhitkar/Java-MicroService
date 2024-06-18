package com.question.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long questionId;
    private  String question;

    private long quizId;
}
