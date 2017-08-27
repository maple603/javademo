package com.javademo.web;

import com.javademo.common.error.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/7/30 下午12:51.
 */
@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(value = "/")
    public String index(){
        return "Hello Spring Boot!!!";
    }

    @RequestMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
}

