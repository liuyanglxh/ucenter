package com.liuyang.ucenter.user.pojo;

import lombok.Data;

/**
 * controller层统一返回的数据结构
 */
@Data
public class Result {

    private Boolean success;
    private String error;
    private Object data;

    private Result() {
    }

    public static Result success() {
        Result result = new Result();
        result.success = true;
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.success = true;
        result.data = data;
        return result;
    }

    public static Result fail(String error) {
        Result result = new Result();
        result.success = false;
        result.error = error;
        return result;
    }
    
}
