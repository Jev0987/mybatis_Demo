package com.JEvin.mapper;

import com.JEvin.bean.User;
import tk.mybatis.mapper.common.Mapper;

/*
 *  @项目名：  mybatisDemo 
 *  @包名：    com.JEvin.mapper
 *  @文件名:   Usermapper2
 *  @创建者:   85169
 *  @创建时间:  2018/9/17 13:33
 *  @描述：    TODO
 */
//@org.apache.ibatis.annotations.Mapper
public interface Usermapper2 extends Mapper<User> {
    //由于使用的是通用mapper，所有方法具体对应的sql语句都已经固定了
    //默认操作的数据库表，实际上就是上面给定的泛型
    //如果上面给定的泛型是User，那么会认为在lesson数据库里面有一张表，这张表叫做User表


    //一种方向是：   直接固定表明就是user

    //另一种方向是：  在类里面（User）里面，表示出来它和哪一张表相对应。JPA  注解
    //JPA 是 jdk5.0（1.5） ，提倡出来的一种针对数据库持久化的一种规范
}
