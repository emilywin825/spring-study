package com.spring.core.chap04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //이제 EsternRestaurant 객체도 스프링이 만듦
public class EsternRestaurant implements Restaurant {

    // 쉐프
    private Chef chef;

    // 요리 코스
    private Course course;

    @Autowired //컨테이너 뒤져서 자동 주입해라 //Course뒤지니까 new SushiCourse 있으니까 자동 주입
    public EsternRestaurant(@Qualifier("kc") Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    // 요리를 주문하는 기능
    public void order() {
        System.out.println("아시안 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
