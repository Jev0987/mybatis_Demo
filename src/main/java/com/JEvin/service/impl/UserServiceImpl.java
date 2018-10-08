package com.JEvin.service.impl;

import com.JEvin.bean.User;
import com.JEvin.mapper.UserMapper;
import com.JEvin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *  @项目名：  mybatisDemo 
 *  @包名：    com.JEvin.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   85169
 *  @创建时间:  2018/9/17 10:56
 *  @描述：    TODO
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {

        userMapper.save(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public User selectOne(Integer id) {

        return userMapper.selectOne(id);
    }

    @Override
    public List<User> selectAll() {

        return userMapper.selectAll();

    }

}
