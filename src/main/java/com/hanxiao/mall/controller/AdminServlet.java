package com.hanxiao.mall.controller;

import com.google.gson.Gson;
import com.hanxiao.mall.model.AdminLoginBO;
import com.hanxiao.mall.service.AdminService;
import com.hanxiao.mall.service.AdminServiceImpl;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@WebServlet("/api/admin/admin/*")
public class AdminServlet extends javax.servlet.http.HttpServlet {
    private Gson gson = new Gson();
    private AdminService adminService = new AdminServiceImpl();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String requestURI = request.getRequestURI();
        String action = requestURI.replace(request.getContextPath() + "/api/admin/admin/", "");
        if ("login".equals(action)) {
            login(request, response);
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletInputStream inputStream = request.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int len=0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1) {
            byteArrayOutputStream.write(bytes, 0, len);
        }
        String requestBody = byteArrayOutputStream.toString();

        AdminLoginBO adminLoginBO = gson.fromJson(requestBody, AdminLoginBO.class);
        if (StringUtils.isEmpty(adminLoginBO.getEmail()) || StringUtils.isEmpty(adminLoginBO.getPwd())) {
            // Todo
        }
        int code = adminService.login(adminLoginBO);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
