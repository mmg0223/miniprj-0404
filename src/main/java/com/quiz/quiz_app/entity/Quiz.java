package com.quiz.quiz_app.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AnswerType correctAnswer;

    @Builder
    public Quiz(String content, Category category, AnswerType correctAnswer) {
        this.content = content;
        this.category = category;
        this.correctAnswer = correctAnswer;
    }

}
