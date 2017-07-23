package com.javademo.start;

import com.javademo.demo.RestClient;
import com.javademo.demo.RestCustomer;
import com.javademo.demo.Weather;
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

    @Autowired
    private RestCustomer restCustomer;

    @Test
    public void getData(){

        String content = restClient.getContent();

        System.out.println(content);

    }


    @Test
    public  void getWeatherTest(){
        String content = restClient.getWeather();
        System.out.println(content);


    }



}
