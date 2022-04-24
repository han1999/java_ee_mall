package com.hanxiao.mall.controller;

import com.google.gson.Gson;
import com.hanxiao.mall.model.Result;
import com.hanxiao.mall.model.bo.OrdersByPageBO;
import com.hanxiao.mall.model.vo.OrdersByPageVO;
import com.hanxiao.mall.service.OrderService;
import com.hanxiao.mall.service.OrderServiceImpl;
import com.hanxiao.mall.utils.HttpUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/api/admin/order/*")
public class OrderServlet extends javax.servlet.http.HttpServlet {
    private Gson gson = new Gson();
    //    private AdminService adminService = new AdminServiceImpl();
//    private GoodsService goodsService = new GoodsServiceImpl();
    private OrderService orderService = new OrderServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String requestURI = request.getRequestURI();
        String action = requestURI.replace(request.getContextPath() + "/api/admin/order/", "");
        if ("ordersByPage".equals(action)) {
            ordersByPage(request, response);
        }
    }

    private void ordersByPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String requestBody = HttpUtils.getRequestBody(request);
        OrdersByPageBO ordersByPageBO = gson.fromJson(requestBody, OrdersByPageBO.class);
        OrdersByPageVO ordersByPageVO=orderService.ordersByPage(ordersByPageBO);
        response.getWriter().println(gson.toJson(Result.ok(ordersByPageVO)));
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String requestURI = request.getRequestURI();
        String action = requestURI.replace(request.getContextPath() + "/api/admin/order/", "");

    }


}
