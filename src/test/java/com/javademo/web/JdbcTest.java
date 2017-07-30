package com.javademo.web;

import com.javademo.domain.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/7/30 下午5:39.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JdbcTest {

    @Autowired
    private UserService userService;

    @Test
    public  void createTest(){

        userService.create("hello",121);

    }

    @Test
    public void getTest(){
       Assert.assertEquals(1,userService.getAllUsers().intValue());
    }
}
