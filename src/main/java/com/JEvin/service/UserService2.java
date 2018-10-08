package com.JEvin.service;

import com.JEvin.bean.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/*
 *  @项目名：  mybatisDemo 
 *  @包名：    com.JEvin.service
 *  @文件名:   UserService2
 *  @创建者:   85169
 *  @创建时间:  2018/9/17 13:36
 *  @描述：    TODO
 */
public interface UserService2 {
    void save2(User user);

    void delete2(Integer id);

    void update2(User user);

    User selectOne2(Integer id);

    List<User> selectAll2();

    //如果要做分页的话，返回值不是list 集合，因为list集合不足以表现分页的数据
    //List<User> findByPage(int currentPage , int pageSize);

    PageInfo<User> findByPage(int currentPage , int pageSize);

}
