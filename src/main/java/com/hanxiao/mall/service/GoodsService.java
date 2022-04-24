package com.hanxiao.mall.service;


import com.hanxiao.mall.model.Type;
import com.hanxiao.mall.model.bo.AddGoodsBO;
import com.hanxiao.mall.model.vo.GoodsByTypeVO;

import java.util.List;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/23
 **/

public interface GoodsService {

    List<Type> getType();

    List<GoodsByTypeVO> getGoodsByType(int typeId);

    void addGoods(AddGoodsBO addGoodsBO);
}
