package com.quiz.quiz_app.dto;

import com.quiz.quiz_app.entity.Answer;
import com.quiz.quiz_app.entity.AnswerType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AnswerDTO {
    // 퀴즈 문제 하나에 대한 채점 결과
    private Long quizId; // 문제 ID
    private String content; // 문제 내용
    private AnswerType userAnswer; // 유저가 고른 답
    private boolean isCorrect; // 정답 여부

    // Answer라는 Entity에서 DTO로 정보를 변환 후 가져오는 작업
    public static AnswerDTO from(Answer answer){
        return AnswerDTO.builder()
                .quizId(answer.getId())
                .content(answer.getQuiz().getContent())
                .userAnswer(answer.getUserAnswer())
                .isCorrect(answer.isCorrect())
                .build();
    }

}
