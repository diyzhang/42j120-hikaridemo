package cn.toj.hikaridemo.service;

import cn.toj.hikaridemo.domain.User;
import cn.toj.hikaridemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int addUser( User user ) {
        return userMapper.addUser(user);
    }

    public List<User> getUsersByName(String userName ) {
        List<User> users = userMapper.getUsersByName( userName );
        return users;
    }
}
