package com.javademo.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/7/30 下午1:28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class HomeTest {
    private MockMvc mvc;

    @Before
    public void setUp(){
       mvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();
    }

    @Test
    public void helloTest(){
        try {
            ResultActions string = mvc.perform(MockMvcRequestBuilders.get("/home/").accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(content().string(equalTo("Hello Spring Boot!!!")));
            System.out.println(string.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
