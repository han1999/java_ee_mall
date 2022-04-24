package com.hanxiao.mall.service;

import com.hanxiao.mall.model.bo.OrdersByPageBO;
import com.hanxiao.mall.model.vo.OrdersByPageVO;

/**
 * @description:
 * @author: hanxiao
 * @date: 2022/4/24
 **/
public interface OrderService {

    OrdersByPageVO ordersByPage(OrdersByPageBO ordersByPageBO);
}
