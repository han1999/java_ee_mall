package com.hanxiao.mall.dao;

import com.hanxiao.mall.model.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: hanxiao
 * @date: 2022/4/20
 **/
public interface AdminDao {

    Integer login(@Param("admin") Admin admin);

    List<Admin> allAdmins(Admin admin);

    Admin getAdminsInfo(Integer id);
}
