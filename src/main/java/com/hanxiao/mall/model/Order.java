package com.hanxiao.mall.model;

import java.sql.Date;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class Order {
   private Integer id;
   private String nickname;
   private String receiver;
   private String address;
   private String telephone;
   private Integer goodsId;
   private String goodsName;
   private Integer specId;
   private String specName;
   private Integer number;
   private Double amount;
   private Integer stateId;
   private Date createTime;
   private Date updateTime;
   private Integer hasComment;
   private Integer userId;

    public Order(Integer id, String nickname, String receiver, String address, String telephone, Integer goodsId, String goodsName, Integer specId, String specName, Integer number, Double amount, Integer stateId, Date createTime, Date updateTime, Integer hasComment, Integer userId) {
        this.id = id;
        this.nickname = nickname;
        this.receiver = receiver;
        this.address = address;
        this.telephone = telephone;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.specId = specId;
        this.specName = specName;
        this.number = number;
        this.amount = amount;
        this.stateId = stateId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.hasComment = hasComment;
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getHasComment() {
        return hasComment;
    }

    public void setHasComment(Integer hasComment) {
        this.hasComment = hasComment;
    }

    public Order(Integer id, String nickname, String receiver, String address, String telephone, Integer goodsId, String goodsName, Integer specId, String specName, Integer number, Double amount, Integer stateId, Date createTime, Date updateTime, Integer hasComment) {
        this.id = id;
        this.nickname = nickname;
        this.receiver = receiver;
        this.address = address;
        this.telephone = telephone;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.specId = specId;
        this.specName = specName;
        this.number = number;
        this.amount = amount;
        this.stateId = stateId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.hasComment = hasComment;
    }

    public Order() {
    }
}
