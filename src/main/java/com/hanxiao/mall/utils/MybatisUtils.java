package com.hanxiao.mall.utils;

import com.hanxiao.mall.service.AdminServiceImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/20
 **/

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = MybatisUtils.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    public static SqlSession openSession() {
        return sqlSessionFactory.openSession();
    }
}
