package com.study.mvc20220927changeun.service;

import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl2 implements TestService{
    @Override
    public void logic1() {
        System.out.println("테스트2클래스에서 logic1 메소드 실행");
    }

    @Override
    public void logic2() {
        System.out.println("테스트2클래스에서 logic2 메소드 실행");
    }
}
