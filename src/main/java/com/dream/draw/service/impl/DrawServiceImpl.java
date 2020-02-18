package com.dream.draw.service.impl;

import com.dream.draw.mapper.DrawMapper;
import com.dream.draw.service.DrawService;
import com.dream.entity.Draw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrawServiceImpl implements DrawService {

    @Autowired
    private DrawMapper drawMapper;

    //增加招领
    @Override
    public Draw insertDraw(Draw draw) {
        drawMapper.insertDraw(draw);
        return draw;
    }

    //查询招领
    @Override
    public List<Draw> selectDraw(Draw draw) {
        return drawMapper.selectDraw(draw);
    }

    //查询单个
    @Override
    public Draw selectDrawById(Integer id) {
        return drawMapper.selectDrawById(id);
    }

    @Override
    public Integer updateDraw(Draw draw) {
        return drawMapper.updateDraw(draw);
    }

    //删除
    @Override
    public Integer deleteDraw(Integer id) {
        return drawMapper.deleteDraw(id);
    }
}
