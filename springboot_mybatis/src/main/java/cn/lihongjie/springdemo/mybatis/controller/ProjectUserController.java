package cn.lihongjie.springdemo.mybatis.controller;

import cn.lihongjie.springdemo.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectUserController {


    @Autowired
    UserMapper userMapper;

    @GetMapping(path = "/getall1")
    public Object getall() {

        return userMapper.getall();

    }
}
