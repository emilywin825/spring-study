package com.spring.core.chap03.config;

import com.spring.core.chap03.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//이 클래스는 주입에 필요한 객체를 관리하는 클래스
//지금 이건 수동 등록 원래는 이렇게 잘 안씀
@Configuration //설정 파일임을 알려줌
public class HotelConfig { //chap02.config의 hotelManager 역할
    //빈 등록 : 스프링이 관리할 객체를 알려주는 작업
    @Bean
    public Chef chef(){
        return new JannChef();
    }

    @Bean
    public Course sushiCourse(){
        return new SushiCourse();
    }

    @Bean
    public Course frencCourse(){
        return new FrenchCourse();
    }

    @Bean
    public Restaurant restaurant(){
        return new WesternRestaurant(chef(),frencCourse());
    }
    @Bean
    public Hotel hotel(){
        return new Hotel();
    }








}
