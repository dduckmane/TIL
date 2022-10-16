package com.example.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QScore is a Querydsl query type for Score
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QScore extends EntityPathBase<Score> {

    private static final long serialVersionUID = 2005995842L;

    public static final QScore score = new QScore("score");

    public final NumberPath<Double> average = createNumber("average", Double.class);

    public final NumberPath<Integer> eng = createNumber("eng", Integer.class);

    public final EnumPath<Grade> grade = createEnum("grade", Grade.class);

    public final NumberPath<Integer> kor = createNumber("kor", Integer.class);

    public final NumberPath<Integer> math = createNumber("math", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> stuNum = createNumber("stuNum", Long.class);

    public final NumberPath<Integer> total = createNumber("total", Integer.class);

    public QScore(String variable) {
        super(Score.class, forVariable(variable));
    }

    public QScore(Path<? extends Score> path) {
        super(path.getType(), path.getMetadata());
    }

    public QScore(PathMetadata metadata) {
        super(Score.class, metadata);
    }

}

