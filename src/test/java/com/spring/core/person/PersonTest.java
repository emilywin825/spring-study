package com.spring.core.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    //테스트 메서드 생성
    @Test
    void lombokTest(){
        Person p = new Person();
        p.setAddress("경기도");
        p.setAge(10);
        p.setNickName("ggg");

        System.out.println(p);
    }

}