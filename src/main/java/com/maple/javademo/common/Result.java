package com.maple.javademo.common;

/**
 * @author maple
 * @name 金色木叶枫
 * Created time on 2017/7/4 下午11:21.
 */
public class Result {
    private int code;
    private String msg;
    private Object model;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getModel() {
        return model;
    }

    public void setModel(Object model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", model=" + model +
                '}';
    }

}
