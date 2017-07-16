package com.javademo.demo;

import sun.awt.windows.ThemeReader;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author maple
 * @name 金色木叶枫
 * Created time on 2017/7/16 上午11:15.
 */
public class BlockingQueueExample {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue queue = new ArrayBlockingQueue(1024);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(2000);
    }

}
