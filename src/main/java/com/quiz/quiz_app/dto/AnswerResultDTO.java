package com.quiz.quiz_app.dto;

import com.quiz.quiz_app.entity.Answer;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class AnswerResultDTO {
    // 유저가 푼 전체 10문제의 최종 결과
    private int score; // 점수(맞춘 개수 x 10 예정)
    private int correctCount; // 맞춘 개수
    private List<AnswerDTO> answers; // AnswerDTO 리스트

    // Answer라는 Entity에서 DTO로 정보를 변환 후 가져오는 작업
    public static AnswerResultDTO from(List<Answer> answerList) {
        int correctCount = (int) answerList.stream().filter(Answer::isCorrect).count();

        List<AnswerDTO> answerDTO = answerList.stream().map(AnswerDTO::from).toList();

        return  new AnswerResultDTO(correctCount * 10, correctCount, answerDTO);
    }

}
