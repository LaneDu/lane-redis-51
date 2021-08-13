package com.galaxy.redisDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author lane
 * @date 2021年07月29日 上午10:50
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @GetMapping("/put")
    public String putKey(@RequestParam(required = true) String key,
                         @RequestParam(required = true) String value){

        redisTemplate.opsForValue().set(key,value,20, TimeUnit.SECONDS);
        return  "success";
    }

    @GetMapping("/get")
    public String getValue(@RequestParam(required = true) String key){

        Object o = redisTemplate.opsForValue().get(key);

        return  o==null?"empty":o.toString();
    }

}
