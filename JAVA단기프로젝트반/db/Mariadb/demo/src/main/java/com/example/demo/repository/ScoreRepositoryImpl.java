package com.example.demo.repository;//package com.practice.hello.repository;
//
//import com.practice.hello.domain.Score;
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.persistence.Entity;
//import javax.persistence.EntityManager;
//
//@RequiredArgsConstructor
//public class ScoreRepositoryImpl implements MyRepositroy{
//    private final JPAQueryFactory queryFactory;
//    @Autowired
//    private final EntityManager em;
//
//
//    @Override
//    public boolean save(Score score) {
//        em.persist(score);
//        return true;
//    }
//
//    @Override
//    public boolean remove(int stuNum) {
//
//        em.remove();
//        return false;
//    }
//}
