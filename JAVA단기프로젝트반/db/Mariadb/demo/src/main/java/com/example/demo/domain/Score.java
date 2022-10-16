package com.example.demo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static com.example.demo.domain.Grade.*;


@Setter @Getter
//@NoArgsConstructor // 기본 생성자

@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Score {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stuNum; // 학번
    // 클라이언트가 전달할 데이터
    private String name; // 학생 이름
    private int kor, eng, math; // 국, 영, 수 점수

    private static int seq; // 일련번호

    // 서버에서 생성하는 데이터

    private Integer total; // 총점
    private double average; // 평균
    private Grade grade; // 학점


    // 총점 평균 계산
    public void calcTotalAndAvg() {
        this.total = kor + eng + math;
        this.average = total / 3.0;
    }
    // 학점 계산
    public void calcGrade() {
        if (this.average >= 90) {
            this.grade = A;
        } else if (this.average >= 80) {
            this.grade = B;
        } else if (this.average >= 70) {
            this.grade = C;
        } else if (this.average >= 60) {
            this.grade = D;
        } else {
            this.grade = F;
        }

    }


}
