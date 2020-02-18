package com.dream.draw.controller;

import com.dream.draw.service.DrawService;
import com.dream.entity.Draw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DrawController {

    @Autowired
    private DrawService drawService;

    @RequestMapping("/selectDraw")
    public List<Draw> selectDraw(Draw draw){
        return drawService.selectDraw(draw);
    }

    @RequestMapping("/insertDraw")
    public String insertDraw(Draw draw){
        Draw draw1 = drawService.insertDraw(draw);
        System.out.println(draw1);
        return "success";
    }

    @RequestMapping("/updateDraw")
    public String updateDraw(Draw draw){
        Integer integer = drawService.updateDraw(draw);
        return "success";
    }

    public String deleteDraw(Integer id){
        Integer integer = drawService.deleteDraw(id);
        return "success";
    }

}
