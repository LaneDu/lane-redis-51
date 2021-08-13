package com.galaxy.rcache.controller;

import com.galaxy.rcache.dao.UserDao;
import com.galaxy.rcache.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lane
 * @date 2021年08月01日 下午7:37
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @GetMapping("/test")
    public List<User> test(){
        List<User> userList = userDao.selectUser();


        return  userList;
    }

}
