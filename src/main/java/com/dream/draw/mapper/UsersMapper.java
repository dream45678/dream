package com.dream.draw.mapper;

import com.dream.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {

    public Integer insertUsers(Users users);

    public List<Users> selectUsers(Users users);

    public Users login(Users users);

    public Users selectUsersById(Integer id);

    //public Integer updateUsers(Users users);

    public Integer deleteUsers(Integer id);

}
