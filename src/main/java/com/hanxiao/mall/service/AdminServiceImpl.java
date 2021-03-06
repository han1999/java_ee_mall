package com.hanxiao.mall.service;

import com.hanxiao.mall.dao.AdminDao;
import com.hanxiao.mall.model.Admin;
import com.hanxiao.mall.model.bo.AdminLoginBO;
import com.hanxiao.mall.model.bo.AdminSearchBO;
import com.hanxiao.mall.model.vo.AdminInfoVO;
import com.hanxiao.mall.utils.Constant;
import com.hanxiao.mall.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/20
 **/

public class AdminServiceImpl implements AdminService{

    @Override
    public int login(AdminLoginBO adminLoginBO) {

        SqlSession sqlSession = MybatisUtils.openSession();
        AdminDao adminDao = sqlSession.getMapper(AdminDao.class);
        Admin admin = new Admin(null, adminLoginBO.getEmail(), null, adminLoginBO.getPwd());
        Integer count = adminDao.login(admin);
        sqlSession.commit();
        sqlSession.close();
        if (count==1){
            return Constant.LOGIN_SUCCESS;
        }
        return  Constant.LOGIN_FAIL;
    }

    @Override
    public List<AdminInfoVO> allAdmins() {
        SqlSession sqlSession = MybatisUtils.openSession();
        AdminDao adminDao = sqlSession.getMapper(AdminDao.class);
        List<Admin> adminList= adminDao.allAdmins(new Admin());
        sqlSession.commit();
        sqlSession.close();
        List<AdminInfoVO> adminInfoVOList = new ArrayList<>();
        for (Admin admin : adminList) {
            AdminInfoVO adminInfoVO = new AdminInfoVO(admin.getId(), admin.getUsername(), admin.getNickname(), admin.getPassword());
            adminInfoVOList.add(adminInfoVO);
        }
        return adminInfoVOList;

    }

    @Override
    public List<AdminInfoVO> getSearchAdmins(AdminSearchBO adminSearchBO) {
        SqlSession sqlSession = MybatisUtils.openSession();
        AdminDao adminDao = sqlSession.getMapper(AdminDao.class);
        Admin admin = new Admin(null, adminSearchBO.getEmail(), adminSearchBO.getNickname(), null);
        List<Admin> adminList = adminDao.allAdmins(admin);
        sqlSession.commit();
        sqlSession.close();
        List<AdminInfoVO> adminInfoVOList = new ArrayList<>();
        for (Admin ad : adminList) {
            AdminInfoVO adminInfoVO = new AdminInfoVO(ad.getId(), ad.getUsername(), ad.getNickname(), ad.getPassword());
            adminInfoVOList.add(adminInfoVO);
        }
        return adminInfoVOList;
    }

    @Override
    public AdminInfoVO getAdminsInfo(Integer id) {
        SqlSession sqlSession = MybatisUtils.openSession();
        AdminDao adminDao = sqlSession.getMapper(AdminDao.class);
        Admin admin = adminDao.getAdminsInfo(id);
        sqlSession.commit();
        sqlSession.close();
        AdminInfoVO adminInfoVO = new AdminInfoVO(admin.getId(), admin.getUsername(), admin.getNickname(), admin.getPassword());
        return adminInfoVO;
    }


}
