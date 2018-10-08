package com.JEvin.service;

import com.JEvin.bean.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/*
 *  @项目名：  mybatisDemo 
 *  @包名：    com.JEvin.service
 *  @文件名:   UserService
 *  @创建者:   85169
 *  @创建时间:  2018/9/17 10:39
 *  @描述：    TODO
 */
public interface UserService {
    void save(User user);

    void delete(Integer id);

    void update(User user);

    User selectOne(Integer id);

    List<User> selectAll();


}
