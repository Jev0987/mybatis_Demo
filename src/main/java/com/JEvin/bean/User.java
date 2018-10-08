package com.JEvin.bean;

import javax.persistence.Id;
import javax.persistence.Table;

/*
 *  @项目名：  mybatisDemo 
 *  @包名：    com.JEvin.bean
 *  @文件名:   User
 *  @创建者:   85169
 *  @创建时间:  2018/9/17 10:40
 *  @描述：    TODO
 */
@Table(name="User")
public class User {

    @Id
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
