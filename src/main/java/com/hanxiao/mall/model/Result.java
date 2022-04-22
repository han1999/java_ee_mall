package com.hanxiao.mall.model;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/22
 **/

public class Result {
    private Integer code;
    private String message;
    private Object data;

    public static Result ok(Object data) {
        return new Result(0, null, data);
    }

    public static Result ok() {
        return ok(null);
    }

    public static Result error(String message) {
        return new Result(10000, message, null);
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result() {
    }
}
