package com.JEvin.controller;

import com.JEvin.bean.User;
import com.JEvin.service.UserService2;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *  @项目名：  mybatisDemo 
 *  @包名：    com.JEvin.controller
 *  @文件名:   UserController2
 *  @创建者:   85169
 *  @创建时间:  2018/9/17 13:40
 *  @描述：    TODO
 */
@RestController
public class UserController2 {
    @Autowired
    private UserService2 userService2;

    @RequestMapping("save2")
    public String save2(){
        User user = new User();
        user.setName("dddddddddd");
        user.setId(20);
        user.setAge(900);
        userService2.save2(user);
        return "save2 success!~!~!!~!";
    }

    @RequestMapping("delete2")
    public String delete(){

        userService2.delete2(13);

        return "delete2 success!~!~";
    }

    @RequestMapping("update2")
    public String update2(){
        User user = new User();
        user.setId(12);
        user.setAge(90);
        //user.setName("rt");
        userService2.update2(user);

        return "update2 success!~!~";
    }

    @RequestMapping("selectOne2")
    public String selectOne2(){

        System.out.println(userService2.selectOne2(1));

        return "selectOne2 success!~!~";
    }

    @RequestMapping("selectAll2")
    public String selectAll2(){

        System.out.println(userService2.selectAll2());

        return "selectAll2 success!~!~";
    }

    //以下方法，分页方法
    @RequestMapping("findByPage")
    public String findByPage(int currentPage,int pageSize){
        PageInfo<User> pageInfo = userService2.findByPage(currentPage, pageSize);

        //通过pageInfo获取属于当前页的相关数据

        List<User> list = pageInfo.getList();

        for(User user :list){
            System.out.println("user=" + user);
        }
        System.out.println("total=" + pageInfo.getTotal());
        System.out.println("pages="+pageInfo.getPages());
        System.out.println("pageSize="+pageInfo.getPageSize());
        System.out.println("getSize="+pageInfo.getSize());
        System.out.println("pageNum="+pageInfo.getPageNum());
        return "findByPage success!~!~";
    }
}
