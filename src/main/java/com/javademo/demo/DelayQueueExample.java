package com.javademo.demo;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author maple
 * @name 金色木叶枫
 * Created time on 2017/7/16 上午11:31.
 */
public class DelayQueueExample {

    public  static void main(String[] args) throws InterruptedException {
        DelayQueue queue = new DelayQueue();

        Delayed delayed = new Delayed() {
            @Override
            public long getDelay(TimeUnit unit) {
                return unit.toSeconds(1);
            }

            @Override
            public int compareTo(Delayed o) {
                return 0;
            }
        };

        queue.put(delayed);

        Delayed element2 = queue.take();
        System.out.println(element2);

    }
}
