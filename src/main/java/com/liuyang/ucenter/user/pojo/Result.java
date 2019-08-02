package com.liuyang.ucenter.user.pojo;

import lombok.Data;

/**
 * controller层统一返回的数据结构
 */
@Data
public class Result<T> {

    private Boolean success;
    private String error;
    private T data;

    private Result() {
    }

    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.success = true;
        return result;
    }

    public static <T> Result success(T data) {
        Result<T> result = new Result<>();
        result.success = true;
        result.data = data;
        return result;
    }

    public static <T> Result fail(String error) {
        Result<T> result = new Result<>();
        result.success = false;
        result.error = error;
        return result;
    }

}
