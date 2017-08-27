package com.javademo.start;

import com.javademo.demo.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/8/27 下午3:57.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TaskTest {

    @Autowired
    private Task task;

    @Test
    public void tastTest(){
        try {
            task.doTaskOne();
            task.doTaskTwo();
            task.doTaskThree();
            task.doTaskFour();
            task.doTaskFive();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
