package com.javademo;

import com.javademo.service.RetryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/8/10 下午11:04.
 */
@Configuration
@EnableRetry
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class RetryServiceMain {
    @Bean
    public RetryService retryService(){
        return new RetryService();
    }
    public static void main(String[] args) throws Exception{
        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(RetryServiceMain.class);
        final RetryService retryService = applicationContext.getBean(RetryService.class);
        retryService.retryTest();
    }
}
