package com.dream.draw.service.impl;

import com.dream.draw.mapper.GoodsMapper;
import com.dream.draw.service.GoodsService;
import com.dream.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    //增加失物
    @Override
    public Integer insertGoods(Goods goods) {
        return goodsMapper.insertGoods(goods);
    }

    //查询失物
    @Override
    public List<Goods> selectGoods(Goods goods) {
        return goodsMapper.selectGoods(goods);
    }

    //查询单个
    @Override
    public Goods selectGoodsById(Integer id) {
        return goodsMapper.selectGoodsById(id);
    }

    //修改失物
    @Override
    public Integer updateGoods(Goods goods) {
        return goodsMapper.updateGoods(goods);
    }

    //删除失物
    @Override
    public Integer deleteGoods(Goods goods) {
        return goodsMapper.deleteGoods(goods);
    }
}
