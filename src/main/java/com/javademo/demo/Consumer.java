package com.javademo.demo;

import java.util.concurrent.BlockingQueue;

/**
 * @author maple
 * @name 金色木叶枫
 * Created time on 2017/7/16 上午11:22.
 */
public class Consumer implements Runnable {
    private BlockingQueue queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
