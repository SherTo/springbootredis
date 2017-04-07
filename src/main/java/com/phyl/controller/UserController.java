package com.phyl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xh on 2017/4/7.
 */
@RestController
public class UserController {
    @Autowired
    RedisTemplate redisTemplate;
    @RequestMapping("test")
    public String getUser() {
        redisTemplate.opsForValue().set("hello", "今天是个好日子");
        String hello = redisTemplate.opsForValue().get("hello").toString();
        System.out.println(hello);
        return hello;
    }
}
