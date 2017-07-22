package com.javademo.demo;

/**
 * @author maple
 * @name 金色木叶枫
 * Created time on 2017/7/11 下午10:56.
 */
public class Student {
    protected   String firstName;
    protected  String lastName;
    protected  Double  grade;
    protected  Double feeDiscount = 0.0;
    protected  Double baseFee = 20000.0;

    public Student(String firstName, String lastName, Double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public void printFee(){
        Double newFee = baseFee - ((baseFee * feeDiscount) / 100);
        System.out.println("The fee after discount: " + newFee);
    }


}
