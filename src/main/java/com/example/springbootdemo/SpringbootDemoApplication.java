package com.example.springbootdemo;

import com.example.springbootdemo.dao.BaseDAO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ZhangJian
 */
@SpringBootApplication
@MapperScan(basePackageClasses = {BaseDAO.class})
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }
}
