package com.javademo.demo.queue;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/9/12 下午11:36.
 */
public class ArrayQueue<E> implements Queue<E> {

    transient Object[] elements;

    transient int tail;

    transient  int head;

    @Override
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    public  void addLast(E e){
        if (e == null){
            throw new  NullPointerException();
        }
        elements[tail] = e;
        if ((tail = (tail + 1) & (elements.length-1 )) == head){
            doubleCapacity();
        }
    }

    private void doubleCapacity() {
        assert head == tail;
        int p = head;
        int n = elements.length;
        int r = n - p; // number of elements to the right of p
        int newCapacity = n << 1;
        if (newCapacity < 0)
            throw new IllegalStateException("Sorry, deque too big");
        Object[] a = new Object[newCapacity];
        System.arraycopy(elements, p, a, 0, r);
        System.arraycopy(elements, 0, a, r, p);
        elements = a;
        head = 0;
        tail = n;
    }


}
