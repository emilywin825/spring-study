package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("kc")
public class KimuraChef implements Chef {

    public void cook() {
        System.out.println("일식 요리의 대가 키무라입니다.");
    }
}
