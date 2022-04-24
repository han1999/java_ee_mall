package com.hanxiao.mall.model.vo;

import java.util.List;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class OrdersByPageVO {
    private Integer total;
    List<OrdersInOrdersByPageVO> orders;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<OrdersInOrdersByPageVO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrdersInOrdersByPageVO> orders) {
        this.orders = orders;
    }

    public OrdersByPageVO(Integer total, List<OrdersInOrdersByPageVO> orders) {
        this.total = total;
        this.orders = orders;
    }

    public OrdersByPageVO() {
    }
}
