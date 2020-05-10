package cn.lihongjie.springdemo.mybatis;

import cn.lihongjie.springdemo.mybatis.mapper.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackageClasses = BaseMapper.class)
@SpringBootApplication
public class Application {


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }
}
