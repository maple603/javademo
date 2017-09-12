package com.javademo.demo.queue;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/9/12 下午11:26.
 */
public interface Queue<E> {

    /**
     * 定义一个boolean的添加方法
     * @param element
     * @return
     */
    boolean add(E element);
    E remove();
    int size();
}
