package com.hanxiao.mall.model.vo;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/23
 **/

public class GoodsByTypeVO {
    private Integer id;
    private String name;
    private Integer typeId;
    private String img;
    private Integer stockNum;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = "http://localhost:8084/"+img;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public GoodsByTypeVO() {
    }
}
