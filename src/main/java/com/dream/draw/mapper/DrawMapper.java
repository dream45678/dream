package com.dream.draw.mapper;

import com.dream.entity.Draw;
import com.dream.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrawMapper {

    //增加
    public Integer insertDraw(Draw draw);

    //查询所有
    public List<Draw> selectDraw(Draw draw);

    //查询单个
    public Draw selectDrawById(Integer id);

    //修改
    public Integer updateDraw(Draw draw);

    //删除
    public Integer deleteDraw(Integer id);


}
