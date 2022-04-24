package com.hanxiao.mall.model.bo;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/23
 **/

public class AddGoodsSpecBO {

    /**
     * unitPrice : 6999
     * specName : 默认
     * stockNum : 100
     */
    private Double unitPrice;
    private String specName;
    private Integer stockNum;

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public String getSpecName() {
        return specName;
    }

    public Integer getStockNum() {
        return stockNum;
    }
}
