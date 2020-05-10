package cn.lihongjie.springdemo.mybatis.controller;

import cn.lihongjie.springdemo.mybatis.entity.generated.ProjectUserExample;
import cn.lihongjie.springdemo.mybatis.mapper.UserMapper;
import cn.lihongjie.springdemo.mybatis.mapper.generated.ProjectUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProjectUserController {


    @Resource
    UserMapper userMapper;

    @Resource
    ProjectUserMapper projectUserMapper;
    @GetMapping(path = "/getall1")
    public Object getall() {

        return userMapper.getall();

    }
    @GetMapping(path = "/getall2")
    public Object getall2() {

        return projectUserMapper.selectByExample(new ProjectUserExample());

    }
}
