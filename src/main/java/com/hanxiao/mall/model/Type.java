package com.hanxiao.mall.model;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/23
 **/

public class Type {
    private int id;
    private String name;

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

    public Type(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Type() {
    }
}
