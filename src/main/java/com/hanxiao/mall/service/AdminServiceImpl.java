package com.hanxiao.mall.service;

import com.hanxiao.mall.dao.AdminDao;
import com.hanxiao.mall.model.AdminLoginBO;
import com.hanxiao.mall.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

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
//        adminDao.lo
        return 0;
    }
}
