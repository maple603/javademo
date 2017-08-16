package com.javademo.demo;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/8/16 下午10:26.
 */
@Data
public class JavaComparable implements Comparable<JavaComparable> {
    private String name;
    private int age;

    public JavaComparable(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(JavaComparable object) {
        return this.getAge()-object.getAge();
    }

    @Override
    public String toString() {
        return "JavaComparable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args){
        List<JavaComparable> arrayList = new ArrayList<>();
        arrayList.add(new JavaComparable("dd",20));
        arrayList.add(new JavaComparable("dd2",10));
        arrayList.add(new JavaComparable("dd3",40));
        arrayList.add(new JavaComparable("dd4",50));

        Collections.sort(arrayList);

        for (JavaComparable javaComparable : arrayList){
            System.out.println(javaComparable.toString());
        }


    }
}
