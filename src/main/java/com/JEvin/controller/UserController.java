package com.JEvin.controller;

import com.JEvin.bean.User;
import com.JEvin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  @项目名：  mybatisDemo 
 *  @包名：    com.JEvin.controller
 *  @文件名:   UserController
 *  @创建者:   85169
 *  @创建时间:  2018/9/17 10:38
 *  @描述：    TODO
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("save")
    public String save(){
        User user = new User();
        user.setId(13);
        user.setName("JJJJJ");
        user.setAge(18);
        userService.save(user);
        return "save success!~!~";
    }

    @RequestMapping("delete")
    public String delete(){

        userService.delete(16);

        return "delete success!~!~";
    }

    @RequestMapping("update")
    public String update(){
        User user = new User();
        user.setId(12);
        user.setAge(90);

        userService.update(user);

        return "update success!~!~";
    }

    @RequestMapping("selectOne")
    public String selectOne(){

        System.out.println(userService.selectOne(1));

        return "selectOne success!~!~";
    }

    @RequestMapping("selectAll")
    public String selectAll(){

        System.out.println(userService.selectAll());

        return "selectAll success!~!~";
    }
}
