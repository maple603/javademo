package com.javademo.web;

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
}
