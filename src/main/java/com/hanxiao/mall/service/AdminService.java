package com.hanxiao.mall.service;

import com.hanxiao.mall.model.bo.AdminLoginBO;
import com.hanxiao.mall.model.bo.AdminSearchBO;
import com.hanxiao.mall.model.vo.AdminInfoVO;

import java.util.List;

/**
 * @description:
 * @author: hanxiao
 * @date: 2022/4/20
 **/
public interface AdminService {
    int login(AdminLoginBO adminLoginBO);

    List<AdminInfoVO> allAdmins();

    List<AdminInfoVO> getSearchAdmins(AdminSearchBO adminSearchBO);

    AdminInfoVO getAdminsInfo(Integer id);
}
