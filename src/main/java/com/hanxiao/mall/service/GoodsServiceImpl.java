package com.hanxiao.mall.service;

import com.hanxiao.mall.dao.GoodsDao;
import com.hanxiao.mall.model.Goods;
import com.hanxiao.mall.model.Type;
import com.hanxiao.mall.model.vo.GoodsByTypeVO;
import com.hanxiao.mall.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/23
 **/

public class GoodsServiceImpl implements GoodsService {

    @Override
    public List<Type> getType() {
        SqlSession sqlSession = MybatisUtils.openSession();
        GoodsDao goodsDao = sqlSession.getMapper(GoodsDao.class);
        List<Type> typeList = goodsDao.getType();
        sqlSession.commit();
        sqlSession.close();
//        if (typeList == null) {
//            typeList = new ArrayList<>();
//        }
        return typeList;
    }

    @Override
    public List<GoodsByTypeVO> getGoodsByType(int typeId) {
        SqlSession sqlSession = MybatisUtils.openSession();
        GoodsDao goodsDao = sqlSession.getMapper(GoodsDao.class);
        List<Goods> goodsList= goodsDao.getGoodsByTypeVO(typeId);
        List<GoodsByTypeVO> goodsByTypeVOList = new ArrayList<>();
        for (Goods goods : goodsList) {
            GoodsByTypeVO goodsByTypeVO = new GoodsByTypeVO();
            goodsByTypeVO.setId(goods.getId());
            goodsByTypeVO.setImg(goods.getImage());
            goodsByTypeVO.setName(goods.getName());
            goodsByTypeVO.setPrice(goods.getPrice());
            goodsByTypeVO.setStockNum(goods.getStockNum());
            goodsByTypeVO.setTypeId(goods.getTypeId());
            goodsByTypeVOList.add(goodsByTypeVO);
        }
        return goodsByTypeVOList;
    }
}
