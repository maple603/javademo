package com.javademo.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/9/3 上午9:50.
 */
@Data
public class TResult<T> implements Serializable {

    private static final long serialVersionUID = 6154506531177786092L;
    private boolean success;
    private int errorCode;
    private String errorInfo;
    private boolean retry;
    private T data;

    /**
     * 成功处理
     * @param data
     * @param <T>
     * @return
     */
    public  static <T extends Serializable> TResult<T> ofSuccess(T data){
        TResult<T> result = new TResult<>();
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    /**
     * 失败返回
     * @param failResult
     * @param <T>
     * @return
     */
    public static <T extends Serializable> TResult<T> ofFailure(TResult failResult){
        return  ofFailure(failResult.errorCode,failResult.errorInfo,failResult.isRetry());
    }

    public  static <T extends Serializable> TResult<T> ofFailure(ResultCode error){
        return  ofFailure(error.getCode(),error.getMsg());
    }


    public  static <T extends Serializable> TResult<T> ofFailure(ResultCode errorCode,boolean retry){
        return ofFailure(errorCode.getCode(),errorCode.getMsg(),retry);
    }

    public static <T extends Serializable> TResult<T> ofFailure(int errorCode,String errorInfo){
        return ofFailure(errorCode,errorInfo,false);
    }

    /**
     * 失败返回失败重试
     * @param errorCode
     * @param errorInfo
     * @param retry
     * @param <T>
     * @return
     */
    public static <T extends Serializable> TResult<T> ofFailure(int errorCode,String errorInfo,boolean retry){
        TResult<T> result = new TResult<>();
        result.setSuccess(false);
        result.setErrorCode(errorCode);
        result.setErrorInfo(errorInfo);
        result.setRetry(retry);
        return result;
    }

    /**
     *  失败返回数据的处理方式
     * @param errorCode
     * @param errorInfo
     * @param data
     * @param <T>
     * @return
     */
    public static <T extends Serializable> TResult<T> ofFailure(int errorCode,String errorInfo,T data){
        TResult<T> result = new TResult<>();
        result.setSuccess(false);
        result.setErrorCode(errorCode);
        result.setErrorInfo(errorInfo);
        result.setData(data);
        return result;
    }

}
