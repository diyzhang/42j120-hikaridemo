package cn.toj.hikaridemo.mapper;

import cn.toj.hikaridemo.domain.User;

import java.util.List;

public interface UserMapper {

    int addUser(User user);

    List<User> getUsersByName(String userName);

}
