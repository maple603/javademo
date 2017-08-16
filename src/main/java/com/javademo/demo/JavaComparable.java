package com.javademo.demo;

import lombok.Data;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/8/16 下午10:26.
 */
@Data
public class JavaComparable implements Comparable<JavaComparable> {
    private String name;
    private Integer age;

    @Override
    public int compareTo(JavaComparable object) {
        return this.age-object.age;
    }
}
