package com.spring.core.person;

import lombok.*;

@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor //기본 생성자
@AllArgsConstructor //모든 파라미터 생성자
//@Data //위에 6개 다 임포트해줌
public class Person {
    private String nickName;
    private String address;
    private int age;

}
