package com.dream.draw.mapper;

import com.dream.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;

import java.util.List;

@Mapper
public interface GoodsMapper {

    public Integer insertGoods(Goods goods);

    public List<Goods> selectGoods(Goods goods);

    public Goods selectGoodsById(Integer id);

    public Integer updateGoods(Goods goods);

    public Integer deleteGoods(Goods goods);

}
