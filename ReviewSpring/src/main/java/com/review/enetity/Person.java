package com.review.enetity;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: 卿建海
 * @date: Created in 2020/12/13 19:07
 * @version:
 * @modified By:
 */
@Component
public class Person {
    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
