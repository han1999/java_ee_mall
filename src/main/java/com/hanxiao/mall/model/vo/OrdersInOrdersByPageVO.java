package com.hanxiao.mall.model.vo;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class OrdersInOrdersByPageVO {
    private Integer id;
    private Integer userId;
    private Integer goodsDetailId;
    private String goods;
    private String spec;
    private Integer goodsNum;
    private Double amount;
    private Integer stateId;
    private String state;
    private UserOfOrdersInOrdersByPageVO user = new UserOfOrdersInOrdersByPageVO();


    private String nickname;
    private String name;
    private String address;
    private String phone;

    public void setNickname(String nickname) {
//        this.nickname = nickname;
        user.setNickname(nickname);
    }

    public void setName(String name) {
//        this.name = name;
        user.setName(name);
    }

    public void setAddress(String address) {
//        this.address = address;
        user.setAddress(address);
    }

    public void setPhone(String phone) {
//        this.phone = phone;
        user.setPhone(phone);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsDetailId() {
        return goodsDetailId;
    }

    public void setGoodsDetailId(Integer goodsDetailId) {
        this.goodsDetailId = goodsDetailId;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
        if (stateId == 0) {
            setState("未付款");
        } else if (stateId == 1) {
            setState("未发货");
        } else if (stateId == 2) {
            setState("已发货");
        } else {
            setState("已到货");
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public UserOfOrdersInOrdersByPageVO getUser() {
        return user;
    }

    public void setUser(UserOfOrdersInOrdersByPageVO user) {
        this.user = user;
    }


    public OrdersInOrdersByPageVO() {
    }
}
