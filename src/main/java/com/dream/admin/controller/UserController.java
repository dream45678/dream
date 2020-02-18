package com.dream.admin.controller;

import com.dream.draw.service.UsersService;
import com.dream.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UsersService usersService;

    //登录
    @RequestMapping("/login")
    public String login(Users users,HttpSession session){
        //查询用户
        Users login = usersService.login(users);
        //判断是否有用户
        if (login != null){
            //有则存入session
            session.setAttribute("user",login);
            return "";
        }
        return "";
    }

    //注册
    @RequestMapping("register")
    public String register(Users users,HttpSession session){
        Integer result = usersService.insertUsers(users);
        if (result > 0){
            Users login = usersService.login(users);
            session.setAttribute("user",login);
            return "success";
        }else{
            return "fail";
        }
    }

    /**
     * 查询所有用户
     * @param users
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectUsers")
    public List<Users> selectUsers(Users users){
        return usersService.selectUsers(users);
    }

}
