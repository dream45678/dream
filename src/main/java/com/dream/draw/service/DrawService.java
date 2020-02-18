package com.dream.draw.service;

import com.dream.entity.Draw;

import java.util.List;

public interface DrawService {

    //增加
    public Draw insertDraw(Draw draw);

    //查询所有
    public List<Draw> selectDraw(Draw draw);

    //查询单个
    public Draw selectDrawById(Integer id);

    public Integer updateDraw(Draw draw);

    //删除
    public Integer deleteDraw(Integer id);
}
