package com.hanxiao.mall.model.vo;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class UserOfOrdersInOrdersByPageVO {
    private String nickname;
    private String name;
    private String address;
    private String phone;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public UserOfOrdersInOrdersByPageVO(String nickname, String name, String address, String phone) {
        this.nickname = nickname;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public UserOfOrdersInOrdersByPageVO() {
    }
}
