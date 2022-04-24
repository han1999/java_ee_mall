package com.hanxiao.mall.service;

import com.hanxiao.mall.dao.OrderDao;
import com.hanxiao.mall.model.bo.OrdersByPageBO;
import com.hanxiao.mall.model.vo.OrdersByPageVO;
import com.hanxiao.mall.model.vo.OrdersInOrdersByPageVO;
import com.hanxiao.mall.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class OrderServiceImpl implements OrderService {
    @Override
    public OrdersByPageVO ordersByPage(OrdersByPageBO ordersByPageBO) {
        SqlSession sqlSession = MybatisUtils.openSession();
        OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
        Integer total = orderDao.getOrdersTotal(ordersByPageBO);
        List<OrdersInOrdersByPageVO> orders = orderDao.getOrders(ordersByPageBO);
        OrdersByPageVO ordersByPageVO = new OrdersByPageVO(total, orders);
        sqlSession.commit();
        sqlSession.commit();
        return ordersByPageVO;
    }
}
