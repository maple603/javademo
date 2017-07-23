package com.javademo.common;

/**
 * @author maple
 * @name 金色木叶枫
 * Created time on 2017/7/5 下午11:40.
 */
public enum  ResultCode {


    SUCCESS(200,"成功"),
    FAIL(400,"失败"),
    UNAUTHORIZED(401,"签名错误"),
    NOT_FOUND(404,"接口不存在");


    public int code;
    public String msg;

    ResultCode(int code , String msg){
        this.code = code;
        this.msg = msg;

    }

}
