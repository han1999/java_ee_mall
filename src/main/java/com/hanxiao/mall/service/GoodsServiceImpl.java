package com.hanxiao.mall.service;

import com.hanxiao.mall.dao.GoodsDao;
import com.hanxiao.mall.model.Goods;
import com.hanxiao.mall.model.Spec;
import com.hanxiao.mall.model.Type;
import com.hanxiao.mall.model.bo.AddGoodsBO;
import com.hanxiao.mall.model.bo.AddGoodsSpecBO;
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
        List<Goods> goodsList = goodsDao.getGoodsByType(typeId);
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

    @Override
    public void addGoods(AddGoodsBO addGoodsBO) {
        List<AddGoodsSpecBO> specList = addGoodsBO.getSpecList();
        Double price = specList.get(0).getUnitPrice();
        Integer stockNum = specList.get(0).getStockNum();
        for (int i = 1; i < specList.size(); i++) {
            if (price > specList.get(i).getUnitPrice()) {
                price = specList.get(i).getUnitPrice();
            }
            stockNum += specList.get(i).getStockNum();
        }

        SqlSession sqlSession = MybatisUtils.openSession();
        GoodsDao goodsDao = sqlSession.getMapper(GoodsDao.class);
        Goods goods = new Goods(null, addGoodsBO.getName(), addGoodsBO.getTypeId(), addGoodsBO.getImg(), stockNum, price, addGoodsBO.getDesc());
        goodsDao.addGoods(goods);
        //goods此时的id不是null了。
        List<Spec> specs = new ArrayList<>();
        for (AddGoodsSpecBO addGoodsSpecBO : specList) {
            Spec spec = new Spec(null, addGoodsSpecBO.getSpecName(), addGoodsSpecBO.getStockNum(), addGoodsSpecBO.getUnitPrice(), goods.getId());
            specs.add(spec);
        }
        goodsDao.addSpecs(specs);
        sqlSession.commit();
        sqlSession.close();
    }
}
