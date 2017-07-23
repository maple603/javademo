package com.javademo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author maple
 * @name 金色木叶枫
 * Created time on 2017/7/22 下午9:40.
 */
@Service
public class RestClient {


    private final RestTemplate template;

    @Autowired
    public RestClient(RestTemplateBuilder restTemplateBuilder) {
        this.template = restTemplateBuilder.build();
    }

    private static final String GITHUB_URL = "https://github.com/trending?l=java&since=weekly";

    public   String getContent(){
        return this.template.getForObject(GITHUB_URL, String.class,new String[]{});

    }

}
