package com.javademo.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/8/27 下午6:23.
 */
@Component
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
    //上一次执行完毕时间点之后5秒再执行
    @Scheduled(fixedDelay = 5000)
    public void outcontent(){
        System.out.println("现在时间-1：" + dateFormat.format(new Date()));
    }
    //第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
    @Scheduled(initialDelay = 1000,fixedRate = 5000)
    public  void outLine(){
        System.out.println("现在时间-2：" + dateFormat.format(new Date()));
    }
}
