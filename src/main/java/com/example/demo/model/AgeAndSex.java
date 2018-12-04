package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class AgeAndSex {
    private int age;

    @Override
    public String toString() {
        return "AgeAndSex{" +
                "age=" + age +
                ", sex=" + sex +
                '}';
    }

    private int sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }


}
