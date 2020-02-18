package com.dream.draw.service;

import com.dream.entity.Goods;

import java.util.List;

public interface GoodsService {
    public Integer insertGoods(Goods goods);

    public List<Goods> selectGoods(Goods goods);

    public Goods selectGoodsById(Integer id);

    public Integer updateGoods(Goods goods);

    public Integer deleteGoods(Goods goods);
}
