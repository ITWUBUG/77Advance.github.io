package com.itheima.day09.work;

/**
 * 演员类
 */
public class Actor {
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public Actor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }
}
