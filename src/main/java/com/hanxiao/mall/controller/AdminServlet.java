package com.hanxiao.mall.controller;

import com.google.gson.Gson;
import com.hanxiao.mall.model.Result;
import com.hanxiao.mall.model.bo.AdminLoginBO;
import com.hanxiao.mall.model.vo.AdminInfoVO;
import com.hanxiao.mall.model.vo.AdminLoginVO;
import com.hanxiao.mall.service.AdminService;
import com.hanxiao.mall.service.AdminServiceImpl;
import com.hanxiao.mall.utils.Constant;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

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
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1) {
            byteArrayOutputStream.write(bytes, 0, len);
        }
        String requestBody = byteArrayOutputStream.toString();

        AdminLoginBO adminLoginBO = gson.fromJson(requestBody, AdminLoginBO.class);

        Result result = new Result();
        if (StringUtils.isEmpty(adminLoginBO.getEmail()) || StringUtils.isEmpty(adminLoginBO.getPwd())) {
            // Todo
            result.setCode(10000);
            result.setMessage("参数不能为空！");
            response.getWriter().println(gson.toJson(result));
            return;
        }
        int code = adminService.login(adminLoginBO);
        if (code == Constant.LOGIN_SUCCESS) {
            result.setCode(0);
            result.setData(new AdminLoginVO(adminLoginBO.getEmail(), adminLoginBO.getEmail()));
        } else if (code == Constant.LOGIN_FAIL) {
            result.setCode(10000);
            result.setMessage("没有这个用户或者密码不正确！");
        }
        String x = gson.toJson(result);
        response.getWriter().println(x);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String requestURI = request.getRequestURI();
        String action = requestURI.replace(request.getContextPath() + "/api/admin/admin/", "");
        if ("allAdmins".equals(action)) {
            allAdmins(request, response);
        }
    }

    private void allAdmins(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<AdminInfoVO> adminInfoVOList = adminService.allAdmins();
        Result result = new Result(0, null, adminInfoVOList);
        response.getWriter().println(gson.toJson(result));
    }
}
