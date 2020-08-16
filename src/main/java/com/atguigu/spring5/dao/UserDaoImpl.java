package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Leo
 * @date 2020/7/27 - 9:18
 */

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao add ...");
    }

}
