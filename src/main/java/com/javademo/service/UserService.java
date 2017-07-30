package com.javademo.service;


import com.javademo.domain.User;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/7/30 下午5:30.
 */
public interface UserService {

    /**
     * 新增一个用户
     * @param name
     * @param age
     */
    void create(String name, Integer age);
    /**
     * 根据name删除一个用户高
     * @param name
     */
    void deleteByName(String name);
    /**
     * 获取用户总量
     */
    Integer getAllUsers();
    /**
     * 删除所有用户
     */
    void deleteAllUsers();


    /**
     * 获取用户信息
     * @param id
     * @return
     */
    User findOne(int id);

}
