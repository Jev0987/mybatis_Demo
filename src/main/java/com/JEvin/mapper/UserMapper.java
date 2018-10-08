package com.JEvin.mapper;

import com.JEvin.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
 *  @项目名：  mybatisDemo 
 *  @包名：    com.JEvin.mapper
 *  @文件名:   UserMapper
 *  @创建者:   85169
 *  @创建时间:  2018/9/17 11:02
 *  @描述：    TODO
 */
@Mapper
public interface UserMapper {
    void save(User user);

    void delete(Integer id);

    void update(User user);

    User selectOne(Integer id);

    List<User> selectAll();
}
