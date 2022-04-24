package com.hanxiao.mall;

import com.hanxiao.mall.model.vo.AdminInfoVO;
import com.hanxiao.mall.service.AdminService;
import com.hanxiao.mall.service.AdminServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/23
 **/

public class AdminTest {
    @Test
    public void testAllAdmins() {
        AdminService adminService = new AdminServiceImpl();
        List<AdminInfoVO> adminInfoVOList = adminService.allAdmins();
        Assert.assertEquals(1, adminInfoVOList.size());
    }
}
