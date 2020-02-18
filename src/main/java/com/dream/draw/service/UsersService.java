package com.dream.draw.service;

import com.dream.entity.Users;

import java.util.List;

public interface UsersService {

    public Integer insertUsers(Users users);

    public List<Users> selectUsers(Users users);

    public Users login(Users users);

    public Users selectUsersById(Integer id);

    //public Integer updateUsers(Users users);

    public Integer deleteUsers(Integer id);
}
