package com.galaxy.rcache.dao;

import com.galaxy.rcache.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lane
 * @date 2021年08月01日 下午7:25
 */
@Repository
public interface UserDao  {

   List<User> selectUser();

}
