package com.hanxiao.mall.controller;

import com.google.gson.Gson;
import com.hanxiao.mall.model.Result;
import com.hanxiao.mall.model.Type;
import com.hanxiao.mall.model.bo.AddGoodsBO;
import com.hanxiao.mall.model.vo.GoodsByTypeVO;
import com.hanxiao.mall.service.GoodsService;
import com.hanxiao.mall.service.GoodsServiceImpl;
import com.hanxiao.mall.utils.FileUploadUtils;
import com.hanxiao.mall.utils.HttpUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/api/admin/goods/*")
public class GoodsServlet extends javax.servlet.http.HttpServlet {
    private Gson gson = new Gson();
    //    private AdminService adminService = new AdminServiceImpl();
    private GoodsService goodsService = new GoodsServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String requestURI = request.getRequestURI();
        String action = requestURI.replace(request.getContextPath() + "/api/admin/goods/", "");
        if ("addType".equals(action)) {
            addType(request, response);
        } else if ("imgUpload".equals(action)) {
            imgUpload(request, response);
        } else if ("addGoods".equals(action)) {
            addGoods(request, response);
        }
    }

    private void addGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String requestBody = HttpUtils.getRequestBody(request);
        AddGoodsBO addGoodsBO = null;
        try {
            addGoodsBO = gson.fromJson(requestBody, AddGoodsBO.class);
            goodsService.addGoods(addGoodsBO);
        } catch (Exception e) {
            response.getWriter().println(gson.toJson(Result.error("参数不合法！")));
            return;
        }
    }

    private void imgUpload(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, Object> paramsMap = FileUploadUtils.getParamsMap(request);
        String filePath = (String) paramsMap.get("file");
//        System.out.println("filePath = " + filePath);
        response.getWriter().println(gson.toJson(Result.ok(filePath)));
    }

    private void addType(HttpServletRequest request, HttpServletResponse response) {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String requestURI = request.getRequestURI();
        String action = requestURI.replace(request.getContextPath() + "/api/admin/goods/", "");
        if ("getType".equals(action)) {
            getType(request, response);
        } else if ("getGoodsByType".equals(action)) {
            getGoodsByType(request, response);
        }
    }

    private void getGoodsByType(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String typeId = request.getParameter("typeId");
        List<GoodsByTypeVO> goodsByTypeVOS = goodsService.getGoodsByType(Integer.parseInt(typeId));
        response.getWriter().println(gson.toJson(Result.ok(goodsByTypeVOS)));
    }

    private void getType(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Type> typeList = goodsService.getType();
        response.getWriter().println(gson.toJson(Result.ok(typeList)));
    }
}
