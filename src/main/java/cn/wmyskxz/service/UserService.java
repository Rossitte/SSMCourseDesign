package cn.wmyskxz.service;

import cn.wmyskxz.entity.User;
import org.springframework.stereotype.Controller;


public interface UserService {
    public User findUser(String usercode, String password);
}
