package com.quiz.quiz_app.dto;

import com.quiz.quiz_app.entity.Category;
import com.quiz.quiz_app.entity.Quiz;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class QuizResponseDTO {
    // 퀴즈를 화면에 보여줄 때 필요한 데이터
    private Long quizId; // 문제 ID
    private String content; // 문제 내용
    private Category category; // 카테고리

    public static QuizResponseDTO from(Quiz quiz) {
        return QuizResponseDTO.builder()
                .quizId(quiz.getId())
                .content(quiz.getContent())
                .category(quiz.getCategory())
                .build();
    }

}
