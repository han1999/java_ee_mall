package com.hanxiao.mall.dao;

import com.hanxiao.mall.model.Goods;
import com.hanxiao.mall.model.Type;

import java.util.List;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/23
 **/

public interface GoodsDao {
    List<Type> getType();

    List<Goods> getGoodsByTypeVO(int typeId);
}
