package com.j2ee.springboot.bean;

import lombok.*;

/**
 * @author xzxie
 * @create 2022/9/22 16:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {

    private String name;
    private Integer age;

    private Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
