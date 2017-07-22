package com.javademo.start;

import com.javademo.demo.RestClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author maple
 * @name 金色木叶枫
 * Created time on 2017/7/22 下午9:57.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestClientTest {

    @Autowired
    private RestClient restClient;

    @Test
    public void getData(){

        String content = restClient.getContent();

        System.out.println(content);

    }
}
