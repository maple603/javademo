package com.javademo.common.error;

import lombok.Data;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/8/27 下午7:21.
 */
@Data
public class ErrorInfo<T> {
    public static final Integer OK = 0;
    public static final Integer ERROR = 100;
    private Integer code;
    private String message;
    private String url;
    private T data;
}
