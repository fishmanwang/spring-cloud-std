package com.study.vo;

import java.io.Serializable;

/**
 * Created by tjwang on 2018/6/4.
 */
public class User implements Serializable {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
