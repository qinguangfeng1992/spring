package com.qinguangfeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2016/9/26.
 */
@SpringBootApplication

@MapperScan("com.qinguangfeng.dao.mapper")
@ComponentScan({"com.qinguangfeng.services","com.fc","com.qinguangfeng.control"})
/*public class Start {


public static void main(String[] args) {
    SpringApplication.run(Start.class, args);
}
    @Bean
    public Object init(){
        System.out.println("自己想要创建的一个对象");
        return new Object();
    }

}*/

public class Start extends SpringBootServletInitializer {

    @Bean
    public Object init(){
        System.out.println("自己想要创建的一个对象");
        return new Object();
    }

}
