package com.spring.core.chap02;

public class WesternRestaurant implements Restaurant {

    // 쉐프
    private Chef chef;

    // 요리 코스
    private Course course;

    public WesternRestaurant(Chef chef, Course course) { //외부에서 넣어줌. 그럼 이거 누가 넣어주는데? 스프링이
        this.chef = chef;
        this.course = course;
    }

    // 요리를 주문하는 기능
    public void order() {
        System.out.println("서양 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
