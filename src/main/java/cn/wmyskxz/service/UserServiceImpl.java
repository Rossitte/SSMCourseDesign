package cn.wmyskxz.service;

import cn.wmyskxz.dao.UserDao;
import cn.wmyskxz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public User findUser(String usercode, String password) {
        return null;
    }
}
