package com.spring.core.chap01;

public class Hotel {

    // 레스토랑 객체에 의존
    private Restaurant restaurant = new EsternRestaurant();


    // 호텔의 정보를 알려주는 기능
    public void inform() {
        System.out.printf("우리 호텔의 레스토랑은 %s입니다.\n"
                        , restaurant.getClass().getSimpleName());

        restaurant.order();
    }

}
