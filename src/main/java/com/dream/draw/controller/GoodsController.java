package com.dream.draw.controller;

import com.dream.draw.mapper.GoodsMapper;
import com.dream.draw.service.GoodsService;
import com.dream.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @ResponseBody
    @RequestMapping("/selectGoods")
    public List<Goods> selectGoods(Goods goods){
        goods.setGoodsname("%"+goods.getGoodsname()+"%");
        List<Goods> goodsList = goodsService.selectGoods(goods);
        return goodsList;
    }

    @ResponseBody
    @RequestMapping("/insertGoods")
    public String insertGoods(Goods goods){
        Integer integer = goodsService.insertGoods(goods);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/updateGoods")
    public String updateGoods(Goods goods){
        Integer integer = goodsService.updateGoods(goods);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/deleteGoods")
    public String deleteGoods(Goods goods){
        Integer integer = goodsService.deleteGoods(goods);
        return "success";
    }
}
