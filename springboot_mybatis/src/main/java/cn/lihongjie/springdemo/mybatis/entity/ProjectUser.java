package cn.lihongjie.springdemo.mybatis.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ProjectUser {
    Long id;
    Long age;
    String name;
    Date createTime;
    Boolean disabled;


}
