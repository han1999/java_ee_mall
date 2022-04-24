package com.hanxiao.mall.dao;

import com.hanxiao.mall.model.bo.OrdersByPageBO;
import com.hanxiao.mall.model.vo.OrdersInOrdersByPageVO;

import java.util.List;

/**
 * @description:
 * @author: hanxiao
 * @date: 2022/4/24
 **/
public interface OrderDao {
    Integer getOrdersTotal(OrdersByPageBO ordersByPageBO);

    List<OrdersInOrdersByPageVO> getOrders(OrdersByPageBO ordersByPageBO);
}
