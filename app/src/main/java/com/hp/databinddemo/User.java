package com.hp.databinddemo;

/**
 *
 * @author tangdekun
 * @date 2018/4/12
 */

public class User {
    private  String Name;
    private int  age;

    public String getName() {
        return Name;
    }

    public User(String name, int age) {
        Name = name;
        this.age = age;
    }
    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
