package com.dream.draw.service.impl;

import com.dream.draw.mapper.UsersMapper;
import com.dream.draw.service.UsersService;
import com.dream.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    //插入
    @Override
    public Integer insertUsers(Users users) {
        return usersMapper.insertUsers(users);
    }

    //查询所有用户
    @Override
    public List<Users> selectUsers(Users users) {
        return usersMapper.selectUsers(users);
    }

    //验证用户名和登录
    @Override
    public Users login(Users users) {
        return usersMapper.login(users);
    }

    //根据id查询
    @Override
    public Users selectUsersById(Integer id) {
        return usersMapper.selectUsersById(id);
    }

    //删除
    @Override
    public Integer deleteUsers(Integer id) {
        return usersMapper.deleteUsers(id);
    }
}
