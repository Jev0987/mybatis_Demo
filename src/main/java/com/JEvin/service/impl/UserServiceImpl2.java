package com.JEvin.service.impl;

import com.JEvin.bean.User;
import com.JEvin.mapper.Usermapper2;
import com.JEvin.service.UserService2;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.prism.impl.Disposer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *  @项目名：  mybatisDemo 
 *  @包名：    com.JEvin.service.impl
 *  @文件名:   UserServiceImpl2
 *  @创建者:   85169
 *  @创建时间:  2018/9/17 13:36
 *  @描述：    TODO
 */
@Service
public class UserServiceImpl2 implements UserService2{
    @Autowired
    private Usermapper2 usermapper2;

    @Override
    public void save2(User user) {
        usermapper2.insert(user);
    }

    @Override
    public void delete2(Integer id) {
        usermapper2.deleteByPrimaryKey(id);
    }

    @Override
    public void update2(User user) {
        usermapper2.updateByPrimaryKey(user);
    }

    @Override
    public User selectOne2(Integer id) {
        return usermapper2.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAll2() {
       return usermapper2.selectAll();
    }

    @Override
    public PageInfo<User> findByPage(int currentPage, int pageSize) {
        //currentPage 查询第几页  pageSize:每页显示几条
        //设置分页查询条件
        PageHelper.startPage(currentPage,pageSize);

        List<User> list = usermapper2.select(null);

        PageInfo<User> PageInfo = new PageInfo<>(list);
        return PageInfo;

    }
}
