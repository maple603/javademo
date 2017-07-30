package com.javademo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/7/30 下午12:08.
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/home")
    public String home(){
        return "hello world";
    }

    @RequestMapping(value = "/",method= RequestMethod.GET)
    public  String index(ModelMap modelMap){
        modelMap.addAttribute("host", "http://www.sushou.me");
        return "index";
    }
}
