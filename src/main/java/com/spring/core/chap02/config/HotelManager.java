package com.spring.core.chap02.config;

// 호텔을 운영하기 위한 객체들을 만들어서 호텔에 주입해주는 클래스
//Spring Container : Bean Factory -> 콩(객체) 만드는 곳


import com.spring.core.chap02.*;

//이제는 여기서만 바꾸면 됨. 
//스프링에서는 이것도 자동으로 해줌
public class HotelManager {
    //쉐프 객체를 생성
    public Chef chef()
    {
        return new KimuraChef();
    }
    //코스 객체를 생성
    public Course course(){
        return new SushiCourse();
    }
    //레스토랑 객체를생성
    public Restaurant restaurant(){
        return new EsternRestaurant(chef(),course());
    }

    //호텔 객체를 생성
    public Hotel hotel(){
        


        //수정자 주입 -> 권장 x -> setter로는 계속 수정할 수 있으므로 안좋음
        Hotel hotel=new Hotel();
        hotel.setRestaurant(restaurant());
        hotel.setHeadChef(chef());

        //생성자 주입 -> 이게 좋음
        return new Hotel(restaurant(),chef());
    }
}
