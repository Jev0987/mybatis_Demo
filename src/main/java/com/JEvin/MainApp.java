package com.JEvin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 *  @项目名：  mybatisDemo 
 *  @包名：    com.JEvin
 *  @文件名:   MainApp
 *  @创建者:   85169
 *  @创建时间:  2018/9/17 10:34
 *  @描述：    TODO
 */
@SpringBootApplication
@MapperScan(basePackages = "com.JEvin.mapper")
public class MainApp {
    public static void main(String [] args){
        SpringApplication.run(MainApp.class,args);
    }
}
