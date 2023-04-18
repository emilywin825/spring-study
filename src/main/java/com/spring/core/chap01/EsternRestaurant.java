package com.spring.core.chap01;

public class EsternRestaurant implements Restaurant {

    // 쉐프
    private Chef chef = new KimuraChef();

    // 요리 코스
    private Course course = new FrenchCourse();

    // 요리를 주문하는 기능
    public void order() {
        System.out.println("아시안 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
