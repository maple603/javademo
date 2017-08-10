package com.javademo.service;

import org.springframework.remoting.RemoteAccessException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/8/10 下午11:01.
 */
@Service
public class RetryService {
    @Retryable(value= {RemoteAccessException.class},maxAttempts = 5,backoff = @Backoff(delay = 5000l,multiplier = 1))
    public void retryTest() throws Exception {
        System.out.println("do something...");
        throw new RemoteAccessException("RemoteAccessException....");
    }

    @Recover
    public void recover(RemoteAccessException e) {
        System.out.println(e.getMessage());
        System.out.println("recover....");
    }
}
